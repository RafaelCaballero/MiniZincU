package minizinc.representation;
/**
 * 
 */

/**
 * Classes implementing this interface ensure that they return a String representation which 
 * is valid for MiniZinc
 * @author rafa
 *
 */
public interface MiniZincRepresentation {
	
	/**
	 * @return A string representation in a valid format for MiniZinc compiler
	 */
	public String print();

}
