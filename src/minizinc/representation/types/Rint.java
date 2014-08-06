package minizinc.representation.types;
import minizinc.representation.TypeName;

/**
 * Represents type int
 * 
 * @author rafa
 */
public class Rint extends Type {


	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "float";
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return TypeName.FLOAT;
		
	}

}
