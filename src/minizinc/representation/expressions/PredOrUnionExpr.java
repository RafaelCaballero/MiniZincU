/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.PredOrUnionExprContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;

/**
 * This class represents either a predicate call or a term of union type.
 * It is not possible to distinguish both at the syntactic level
 * Grammar:
 * predOrUnionExpr: ID (twosections | onesection) ;
 * onesection :  ('('expr (','expr)*')')?;
 * twosections : '(' guard ')' '(' expr ')';
 *
 * @author rafa
 *
 */
public class PredOrUnionExpr extends Expr{
	protected ID id;
	protected List<Expr> args;
	/**
	 * declaration of local variables; used in two sections arguments
	 */
	protected List<InDecl> lindecl; 
	/**
	 * This is a one section predorunion, that is: <br>
	 * id(arg1...argn)
	 * @param id : name of the predicate
	 * @param args : a list with only one element, the expr
	 */
	public PredOrUnionExpr(ID id,  List<Expr> args) {
		this.id = id;
		this.args = args;
		lindecl = null;
	}

	/**
	 * This is a one section predorunion, that is: <br>
	 * id(arg1...argn).
	 * @param id : name of the predicate as String
	 * @param args : a list with only one element, the expr
	 */
	public PredOrUnionExpr(String id,  List<Expr> args) {
		this.id = new ID(id);
		this.args = args;
		lindecl = null;
	}

	/**
	 * Two sections preodorunion:<br>
	 * id(var in setexpr....)(expr)
	 * @param id : name of the predicate
	 * @param lindecl : local declarations
	 * @param args : a list with only one element, the expr
	 */
	public PredOrUnionExpr(ID id, List<InDecl> lindecl, List<Expr> args) {
		this.id = id;
		this.args = args;
		this.lindecl = lindecl;
	}

	@Override
	public String print() {
		String s = id.print();
		if (lindecl!=null) 
			// two section
			s+="("+printList(lindecl)+")";
		s+="("+printList(args)+")";

		return s;
	}


	@Override
	public TypeName type() {		
		return TypeName.PRED_OR_UNION;
	}
	
	/**
	 * @param ctx 
	 * @return The Java representation
	 */
	public static PredOrUnionExpr predOrUnionExpr(
			PredOrUnionExprContext ctx) {
		PredOrUnionExpr t = null;
		if (Parsing.hasTerminal(ctx.ID())) {
			// pred or constructor name
			ID id = ID.IDTerm(ctx.ID());
			if (Parsing.has(ctx.onesection())) {
				List<Expr> lexpr = ctx.onesection().expr().stream().map(x->Expr.expr(x)).collect(Collectors.toList());
				t = new PredOrUnionExpr(id,lexpr);
			} else if (Parsing.has(ctx.twosections())) {
				List<InDecl> lindecl = ctx.twosections().guard().inDecl().stream().
						               map(x->InDecl.inDecl(x)).
						               collect(Collectors.toList());
				Expr expr = expr(ctx.twosections().expr());
				List<Expr> l = new ArrayList<Expr>();
				l.add(expr);
				t =  new PredOrUnionExpr(id,lindecl,l);				
			}
		} else
			Parsing.error("PredOrUnionExpr " + ctx.getText());
		return t;
	}

	@Override
	public PredOrUnionExpr clone() {
		PredOrUnionExpr r = null;
		ID idp = id==null ? null : id.clone();
		List<InDecl> lindeclp = null;
		List<Expr> argsp = null;
		if (lindecl!=null) {
			lindeclp = new ArrayList<InDecl>();
			for (InDecl i:lindecl)
				lindeclp.add(i.clone());
		}
		if (args != null) {
			argsp = new ArrayList<Expr>();
			for (Expr e: args) 
				argsp.add(e.clone());
		}
		r = new  PredOrUnionExpr( idp, lindeclp, argsp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((args == null) ? 0 : args.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lindecl == null) ? 0 : lindecl.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PredOrUnionExpr other = (PredOrUnionExpr) obj;
		if (args == null) {
			if (other.args != null)
				return false;
		} else if (!args.equals(other.args))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lindecl == null) {
			if (other.lindecl != null)
				return false;
		} else if (!lindecl.equals(other.lindecl))
			return false;
		return true;
	}

	public ID getId() {
		return id;
	}

	public List<Expr> getArgs() {
		return args;
	}

	public List<InDecl> getLindecl() {
		return lindecl;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		ID id2 = this.applyTransformer2(t, id);
		List<Expr> args2 = this.applyTransformerList(t, args);
		
		args= args2;
		id = id2;
		
	}


}
