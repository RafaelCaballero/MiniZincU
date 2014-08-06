package minizinc.representation.types;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;

/**
 * Represents type int
 * 
 * @author rafa
 */
public class TypeData extends Type {

	private ID id;
	private Expr e;
	
	/**
	 * Constructor: name of the data type and level (an integer expr).
	 */
	public TypeData(ID id, Expr e) {
		this.id = id; this.e = e;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return id.print()+"("+e.print()+")";
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return TypeName.DATA;		
	}
	public ID getId() {
		return id;
	}

	public Expr getE() {
		return e;
	}

}
