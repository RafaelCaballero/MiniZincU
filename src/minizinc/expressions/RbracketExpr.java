/**
 * 
 */
package minizinc.expressions;

import java.util.Arrays;
import java.util.List;

/**
 * A round bracket expression
 * 
 * @author rafa
 *
 */
public class RbracketExpr extends Expr {
	private Expr e;
	/**
	 * @param source The expression found between round brackets
	 */
	public RbracketExpr(Expr source) {
		e = source;

	}


	@Override
	public String print() {
		return "("+e.print()+")";
	}

	@Override
	public List<? extends Expr> subexpressions() {
		return Arrays.asList(e);
	}


	@Override
	public Type type() {
		return e.type();
	}


}
