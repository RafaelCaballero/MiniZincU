/**
 * 
 */
package minizinc.representation.statement;

import java.util.ArrayList;
import java.util.List;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.FunctionContext;
import minizinc.antlr4.MiniZincGrammarParser.OpOrIDContext;
import minizinc.antlr4.MiniZincGrammarParser.QualNameContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;


class OpOrID  implements MiniZincRepresentation, Cloneable {
	protected ID id;
	protected String op;
	
	public OpOrID(ID id) {
		this.id = id;
		op = null;
	}

	public OpOrID(String op) {
		this.id = null;
		this.op = op;
		
	}
	public OpOrID(ID idp, String opp) {
		this.id = idp;
		this.op = opp;

	}

	public static OpOrID opOrID(OpOrIDContext ctx) {
		OpOrID r = null;
		if (Parsing.hasTerminal(ctx.ID())) {
			ID id = ID.IDTerm(ctx.ID());
			r = new OpOrID(id); 
		} else if (Parsing.has(ctx.op())) {
			String op = ctx.op().getText();
			r = new OpOrID(op);
		} else Parsing.error("OpOrID "+ctx.getText());
		
		return r;
	}
	@Override
	public String print() {
		String s = id == null ? op : id.print();
		return s;
	}
	
    @Override 
    public OpOrID clone(){
    	OpOrID r=null;
    
		ID idp = id == null ? null : id.clone();
		String opp = op;
    		
    	r = new OpOrID(idp,opp);
    	return r;

    }
}
 class QualName implements MiniZincRepresentation, Cloneable {
	 protected OpOrID opid1;
	 protected OpOrID opid2;
	 protected boolean extendsmark;
		
	/**
	 * Constructor for names of the fom id1 extendsmark id2 or id1:id2 
	 * @param id12
	 * @param id22
	 * @param b
	 */
	public QualName(OpOrID opid1, OpOrID opid2, boolean b) {
		extendsmark = b;
		this.opid1=opid1;
		this.opid2 = opid2;		
	}

	public QualName(OpOrID opid1) {
		extendsmark = false;
		this.opid1=opid1;
		this.opid2 = null;		
	}

	@Override
	public String print() {
		String s;
		if (opid2==null && !extendsmark)
			s = opid1.print();
		else			
	       s = opid1.print()+(extendsmark ? " extends " : ":")+opid2.print();
		
		return s;
	}
		
	/**
	 * Parser of qualname. Grammar:<br>
	 * qualName : ID |  ID':'opOrID | opOrID extendsmark opOrID;<br>
     *varmark : 'var';<br>
     *extendsmark : 'extends';<br>
     *opOrID : op | ID;<br>
	 * @param ctx Parsing context.
	 * @return Representation
	 */
	public static QualName qualName(QualNameContext ctx) {
		QualName r = null;
		if (Parsing.hasTerminal(ctx.ID())) {
			ID id1 = ID.IDTerm(ctx.ID());
			OpOrID oid1 = new OpOrID(id1);				
			if (ctx.opOrID().size()==1) {
				OpOrID oid2 = OpOrID.opOrID(ctx.opOrID(0));				
				r = new QualName(oid1,oid2,false);
			} else
				r = new QualName(oid1);			
		} else if (ctx.opOrID().size()==2) {
				OpOrID oid1 = OpOrID.opOrID(ctx.opOrID(0));				
				OpOrID oid2 = OpOrID.opOrID(ctx.opOrID(1));				
				r = new QualName(oid1,oid2,true);
			}
			else
				Parsing.error("QualName, unexpected opOrID number: "+ctx.opOrID().size()+"("+ ctx.getText()+" )"); 	

		
		return r;
		
	}
	
	@Override
	public QualName clone() {
		QualName  r=null; 
		OpOrID opid1p =  opid1 == null ? null : opid1.clone();
		OpOrID opid2p =  opid2 == null ? null : opid2.clone(); 
		boolean extendsmarkp = extendsmark; 
		r = new QualName(opid1p,opid2p,extendsmarkp);
		return r;
	}

};

/**
 * Represents a predicate definition. Grammar:<br>
 * function : 'function' varmark? qualName '(' (decl(','decl)*)? ')' '=' expr;
 * @author rafa
 *
 */
public class Function extends Statement {
	protected boolean varmark;
	protected QualName qualName;
	protected List<Decl> decls;
	protected Expr expr;
	
	/**
	 * Constructs the representation of a MiniZinc function
	 */
	public Function(boolean varmark, QualName qualName,
					List<Decl> decls, Expr expr) {
		super(TStatement.FUNCTION);
		this.varmark = varmark;
		this.qualName = qualName;
		this.decls = decls;
		this.expr = expr;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "function "+
	            (varmark ? "var "  : "") +
	            qualName.print()+"("+printList(decls)+")" + "=\n" + expr.print();
	}


	
	public List<Decl> getDecls() {
		return decls;
	}
	
	public Expr getBody() {
		return expr;
	}
	
	public QualName getName() {
		return qualName;
	}

	public static Statement function(FunctionContext ctx) {
		Function r = null;
		List<Decl> decls = new ArrayList<Decl>();
		// just to check if the grammar has changed
		if (Parsing.has(ctx.qualName()) && Parsing.has(ctx.expr())) {
			QualName qualName = QualName.qualName(ctx.qualName());
			Expr expr = Expr.expr(ctx.expr());
			boolean varmark=Parsing.has(ctx.varmark());
			r = new Function(varmark,qualName,decls,expr);	
			
		} else
			Parsing.error("function : "+ctx.getText());

		return r;
	}

	@Override
	public Function clone() {
		Function r = null;
		boolean varmarkp=varmark;
		QualName qualNamep=qualName == null ? null : qualName.clone();
		List<Decl> declsp = null;
		Expr exprp = expr == null ? null : expr.clone();
		if (decls!=null) {
			declsp  = new ArrayList<Decl>();
			for (Decl d:decls) 
				declsp.add(d.clone());
			
		}
			
		r = new Function(varmarkp,qualNamep,declsp,exprp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((decls == null) ? 0 : decls.hashCode());
		result = prime * result + ((expr == null) ? 0 : expr.hashCode());
		result = prime * result
				+ ((qualName == null) ? 0 : qualName.hashCode());
		result = prime * result + (varmark ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Function other = (Function) obj;
		if (decls == null) {
			if (other.decls != null)
				return false;
		} else if (!decls.equals(other.decls))
			return false;
		if (expr == null) {
			if (other.expr != null)
				return false;
		} else if (!expr.equals(other.expr))
			return false;
		if (qualName == null) {
			if (other.qualName != null)
				return false;
		} else if (!qualName.equals(other.qualName))
			return false;
		if (varmark != other.varmark)
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		List<Decl> decls2 = this.applyTransformerList2(t, decls);
		Expr expr2 = this.applyTransformer(t, expr);
		
		decls = decls2;
		expr = expr2;

		
	}

}
