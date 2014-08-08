/**
 * 
 */
package minizinc.representation.expressions.sets;

import java.util.List;

import minizinc.representation.TypeName;
import minizinc.representation.expressions.Expr;

/**
 * Representation of MiniZinc Sets.
 * Grammar: 
 * setExpr : setVal | setExpr infixSetOp setExpr;
 * @author rafa
 *
 */
public abstract class SetExpr extends Expr {


	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		// TODO Auto-generated method stub
		return TypeName.SET;
	}

}
