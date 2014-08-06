/**
 * 
 */
package minizinc.representation;


/**
 * Expression that just contains an Expression
 * @author rafa
 *
 */
public interface Container {
	
	
	/**
	 * Type of class contained.
	 * @return The name of the class as an enumerated value
	 */
	public TokenType getToken();
	

}
