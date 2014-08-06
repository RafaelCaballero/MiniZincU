/**
 * 
 */
package minizinc.expressions;



/**
 * @author rafa
 *
 */
public  abstract class BoolComplexExpr extends Expr {

	public Type type() {
		return Type.BOOL;
	}
	
}
