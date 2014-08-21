/**
 * 
 */
package minizinc.representation.expressions;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.ExprContext;
import minizinc.antlr4.MiniZincGrammarParser.NotExprContext;
import minizinc.representation.Parsing;

/**
 * BoolComplexExprssion as a not(e) expression
 * @author rafa
 *
 */
public class NotBoolExpr extends BoolExpr {
	
	private Expr e;

	

	/**
	 * Constructor for not(e)
	 * @param e the negated expression
	 */
	public NotBoolExpr (Expr e) {
		this.e = e;
	}


	@Override
	public String print() {
		return "not (" + e + ")";

	}

	
	/**
	 * Grammar: <br>
	 * notExpr : 'not' expr ;
	 * 
	 * @param ctx
	 *            Grammar context
	 * @return NotBoolExpr representation
	 */
	public static NotBoolExpr notBoolExpr(NotExprContext ctx) {
		NotBoolExpr t = null;
		ExprContext e0 = ctx.expr();
		if (e0 != null) {
			t = new NotBoolExpr(expr(e0));
		} else
			Parsing.error("notBoolExpr " + ctx.toString());

		return t;
	}


	@Override
	public NotBoolExpr clone() {
		NotBoolExpr r = null;
		Expr exprp = e==null  ? null : e.clone();
		r = new NotBoolExpr(exprp);
		return r;	
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((e == null) ? 0 : e.hashCode());
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
		NotBoolExpr other = (NotBoolExpr) obj;
		if (e == null) {
			if (other.e != null)
				return false;
		} else if (!e.equals(other.e))
			return false;
		return true;
	}


	@Override
	public void subexpressions(ExprTransformer t) {
		Expr e2 =this.applyTransformer(t, e);
		e = e2;
		
	}




}
