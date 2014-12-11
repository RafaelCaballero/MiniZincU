/**
 * 
 */
package minizinc.representation.types;

import minizinc.representation.TypeName;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.sets.BracketExpr;

/**
 * An ID as a typename. It can be
 * <ol>
 * <li>An extension name in extended MiniZinc
 * <li>A range determined by the name of a set.
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return id.print();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return TypeName.EXTENSION_OR_RANGE;
	}

	public ID getId() {
		return id;
	}

	@Override
	public TypeID clone() {
		TypeID r = null;
		ID idp = id.clone();

		r = new TypeID(idp);
		// TODO Auto-generated method stub
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TypeID other = (TypeID) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public Expr zero() {
		// At the moment we assume that this is a set an return the empty set
		// todo: check if it is an extension!
		return new BracketExpr();
	}

}
