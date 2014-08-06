/**
 * 
 */
package minizinc.expressions;

import java.util.List;

import minizinc.MiniZincRepresentation;

/**
 * Java representation of general expressions in MiniZinc.
 * It is an abstract class. All the particular expressions extend this class.
 * 
 * @author rafa
 *
 */
public abstract class Expr implements MiniZincRepresentation {
	/**
	 * @return A list with all the proper subexpressions of the current expression,
	 * that is all the subexpressions except itself-
	 */
	public abstract List<? extends Expr> subexpressions();
	
	/**
	 * @return The expression type
	 */
	public abstract Type type();
	
	/**
	 * Checking if an expression is atomic. Examples of atomic subexpressions are
	 * integers, variables, ....
	 * @return true if this is an atomic subexpression
	 */
	public boolean atomic() {
		List<? extends Expr> l =  subexpressions();
		return l ==null || l.size()==0;
	}
	
	@Override
	public String toString() {
		return print();
	}
	
}
