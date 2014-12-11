/**
 * 
 */
package minizinc.representation;

/**
 * Indicates that the object can return its type as a MiniZinc object.
 * 
 * @author rafa
 * @see TypeName
 */
public interface Typeable {
	/**
	 * @return The expression type
	 */
	public abstract TypeName type();

}
