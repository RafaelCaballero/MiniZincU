/**
 * 
 */
package minizinc.representation.expressions;

import minizinc.representation.TypeName;



/**
 * @author rafa
 *
 */
public  abstract class BoolComplexExpr extends Expr {

	public TypeName type() {
		return TypeName.BOOL;
	}
	
}
