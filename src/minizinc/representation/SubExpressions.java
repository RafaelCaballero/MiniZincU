/**
 * 
 */
package minizinc.representation;

import java.util.List;

import minizinc.representation.expressions.Expr;

/**
 * The classes that implement this interface agree to return a list with all their first level 
 * subexpressions. That its, the list the subexpressions that:
 * <ul>
 * <li> Not contain this object (in case the object itself is a expression)
 * <li> No expression in the list is subexpression of another
 *  <li> All the proper subexpressions of the objects are either in the list or are 
 *  subexpressions of an element of the list.  
 * </ul>
 * @author rafa
 *
 */
public interface SubExpressions {
	/**
	 * @return A list with all the proper subexpressions of the current expression,
	 * that is all the subexpressions except itself-
	 */
	public  List<Expr> subexpressions();

}
