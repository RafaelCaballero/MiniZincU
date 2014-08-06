/**
 * 
 */
package minizinc.expressions;

import java.util.Arrays;
import java.util.List;

import terms.Term;

/**
 * BoolComplexExprssion as a not(e) expression
 * @author rafa
 *
 */
public class NotComplexBoolExpr extends BoolComplexExpr {
	
	private Expr e;

	

	/**
	 * Constructor for not(e)
	 * @param e the negated expression
	 */
	public NotComplexBoolExpr (Expr e) {
		this.e = e;
	}


	@Override
	public String print() {
		return "not (" + e + ")";

	}

	@Override
	public List<? extends Expr> subexpressions() {
		return Arrays.asList(e);
	}

}
