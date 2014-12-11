package minizinc.representation.types;

import java.util.ArrayList;
import java.util.List;

import minizinc.representation.TypeName;
import minizinc.representation.expressions.Expr;

/**
 * A type array is defined by:
 * <ol>
 * <li>The array dimensions
 * <li>The array elements type
 * </ol>
 * 
 * @author rafa
 *
 */
public class TypeArray extends Type {
	private List<Type> dimensions;
	private Type base;

	/**
	 * Constructor for arrays
	 * 
	 * @param dimensions
	 *            Dimensions defining the array
	 * @param base
	 *            base type
	 */
	public TypeArray(List<Type> dimensions, Type base) {
		this.dimensions = dimensions;
		this.base = base;
	}

	/**
	 * This is used because the type cannot be written complete since we don't
	 * know if the type base is a var or not. That is, with the info in this
	 * class it could be:
	 * <ol>
	 * <li> {@code array [dim1...dimn] of base}, or
	 * <li> {@code array [dim1...dimn] of var base}
	 * </ol>
	 * This method returns the first part, until {@code of}
	 * 
	 * @return The first part of the type of the form:
	 *         {@code array [dim1...dimn] of}
	 */
	public String printDimensions() {
		String s = "array [";
		s += printList(dimensions);
		s += "] of ";
		return s;

	}

	/**
	 * This is used because the type cannot be written complete since we don't
	 * know if the type base is a var or not. That is, with the info in this
	 * class it could be:
	 * <ol>
	 * <li> {@code array [dim1...dimn] of base}, or
	 * <li> {@code array [dim1...dimn] of var base}
	 * </ol>
	 * This method returns the first part, until {@code of}
	 * 
	 * @return The second part of the type, the representation of {@code base}
	 */
	public String printBase() {
		return base.print();

	}

	/**
	 * In this type {@code print} is not really useful. see {@link printBase}
	 * and {@link printDimensions}
	 */
	@Override
	public String print() {
		// TODO Auto-generated method stub
		return printDimensions() + printBase();
	}

	@Override
	public TypeName type() {
		return TypeName.ARRAY;
	}

	@Override
	public TypeArray clone() {
		TypeArray r = null;
		// private List<Type> dimensions;
		List<Type> dimensionsp = null;
		// private Type base;
		Type basep = null;
		if (dimensions != null) {
			dimensionsp = new ArrayList<Type>();
			for (Type t : dimensions) {
				dimensionsp.add(t.clone());
			}
		}

		if (base != null)
			basep = base.clone();

		r = new TypeArray(dimensionsp, basep);

		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((base == null) ? 0 : base.hashCode());
		result = prime * result
				+ ((dimensions == null) ? 0 : dimensions.hashCode());
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
		TypeArray other = (TypeArray) obj;
		if (base == null) {
			if (other.base != null)
				return false;
		} else if (!base.equals(other.base))
			return false;
		if (dimensions == null) {
			if (other.dimensions != null)
				return false;
		} else if (!dimensions.equals(other.dimensions))
			return false;
		return true;
	}

	@Override
	public Expr zero() {
		// TODO. Zero of an array?
		return null;
	}

}
