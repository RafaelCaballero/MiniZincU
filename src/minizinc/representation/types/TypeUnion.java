package minizinc.representation.types;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.ArithExpr;
import minizinc.representation.expressions.ID;

/**
 * 
 * @author rafa
 */
public class TypeUnion extends Type {

	private ID id;
	private ArithExpr e;
	
	/**
	 * Constructor: name of the data type and level (an integer expr).
	 */
	public TypeUnion(ID id, ArithExpr e) {
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
		return TypeName.UNION;		
	}
	public ID getId() {
		return id;
	}

	public ArithExpr getE() {
		return e;
	}

}
