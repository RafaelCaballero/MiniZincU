/**
 * 
 */
package minizinc.representation.statement;

import java.util.ArrayList;
import java.util.List;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.FunctionContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;

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
