package minizinc.representation.types;
import minizinc.representation.TypeName;

/**
 * Represents type int
 * 
 * @author rafa
 */
public class Rfloat extends Type {


	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "int";
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return TypeName.INT;
		
	}

}
