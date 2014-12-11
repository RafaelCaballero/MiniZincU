package minizinc.representation.types;

import minizinc.representation.TypeName;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.IntC;

/**
 * Represents type int
 * 
 * @author rafa
 */
public class Rint extends Type {

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "int";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return TypeName.INT;

	}

	@Override
	public Rint clone() {
		return new Rint();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		return prime;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public Expr zero() {
		return new IntC(0);
	}

}
