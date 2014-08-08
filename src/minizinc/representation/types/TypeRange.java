/**
 * 
 */
package minizinc.representation.types;

import minizinc.representation.TypeName;
import minizinc.representation.expressions.*;

/**
 * A type range. In principle two forms are possible
 * <ol>
 * <li> from..to
 * <li> ID , with id a set constant identifier
 * </ol>
 * However the second possibility requires a semantic checking of id as a set.
 * Otherwise it is ambiguous and the id can be also an extension type,
 * which can correspond to the {@link TypeID} class.
 * @author rafa
 *
 */
public class TypeRange extends Type {
	private ArithExpr from;
	private ArithExpr to;
	private ID setID;
	/**
	 * First constructor from..to
	 */
	public TypeRange(ArithExpr from,ArithExpr to) {
		this.setID=null;
		this.from = from;
		this.to = to;
	}

	/**
	 * Second constructor
	 */
	public TypeRange(ID setID) {
		this.setID= setID;
		this.from = null;
		this.to = null;
	}
	
	public boolean isFromToRange() {
		return setID==null;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String s=null;
		s = isFromToRange() ?  from.print() + ".." + to.print() : setID.print();
		return s;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return TypeName.RANGE;
	}

}
