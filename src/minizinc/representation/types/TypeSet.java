package minizinc.representation.types;
import minizinc.representation.TypeName;

/**
 * Represents type int
 * 
 * @author rafa
 */
public class TypeSet extends Type {
	/**
	 * elems type
	 */
	private Type elem;

	public TypeSet(Type elem) {
		this.elem = elem;
	}
	
	public Type getElem() {
		return elem;
	}
	
	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "set of "+elem.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return TypeName.INT;
		
	}

}
