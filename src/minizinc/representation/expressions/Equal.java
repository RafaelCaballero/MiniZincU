/**
 * 
 */
package minizinc.representation.expressions;

/**
 * @author rafa
 *
 */
public class Equal extends InfixExpr {

	/**
	 * Represents e1=e2
	 * 
	 * @param e1
	 * @param e2
	 */
	public Equal(Expr e1, Expr e2) {
		super("=", e1, e2);
	}

}
