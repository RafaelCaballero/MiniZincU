package minizinc.representation.types;

import minizinc.representation.TypeName;
import minizinc.representation.expressions.BoolC;
import minizinc.representation.expressions.Expr;

/**
 * Represents type int
 * 
 * @author rafa
 */
public class Rbool extends Type {

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "bool";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return TypeName.BOOL;

	}

	@Override
	public Rbool clone() {
		// TODO Auto-generated method stub
		return new Rbool();
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
		// TODO Auto-generated method stub
		return new BoolC(false);
	}

}
