/**
 * 
 */
package minizinc.representation.expressions.lists;

import minizinc.representation.TypeName;
import minizinc.representation.expressions.Expr;

/**
 * Main class representing lists. It is an abstract class used just to inherit and 
 * to determine the type.<br>
 * Grammar:<br>
 * listExpr: listValue<br> 
 *         | listExpr '++' listExpr<br>
 *         | oneDimList <br>
 *         | multiDimList ;<br>
 *
 * 
 * @author rafa
 *
 */
public abstract class ListExpr extends Expr {

	
	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		// TODO Auto-generated method stub
		return TypeName.LIST;
	}

}
