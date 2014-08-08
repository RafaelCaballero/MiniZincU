/**
 * 
 */
package minizinc.representation.types;

import minizinc.representation.TypeName;
import minizinc.representation.expressions.ID;

/**
 *  An ID as a typename. It can be 
 * <ol>
 * <li> An extension name in extended MiniZinc
 * <li> A range determined by the name of a set.
 * <ol>
 *
 * @author rafa
 *
 */
public class TypeID extends Type {
	private ID id;
	
	/**
	 * Constructor: name of the type
	 */
	public TypeID(ID id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return id.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return TypeName.EXTENSION_OR_RANGE;
	}

	public ID getId() {
		return id;
	}

}
