/**
 * 
 */
package minizinc.representation.expressions;

import java.util.List;

import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.SubExpressions;
import minizinc.representation.Typeable;

/**
 * Java representation of general expressions in MiniZinc.
 * It is an abstract class. All the particular expressions extend this class.
 * 
 * @author rafa
 *
 */
public abstract class Expr implements MiniZincRepresentation, SubExpressions, Typeable {
	

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
