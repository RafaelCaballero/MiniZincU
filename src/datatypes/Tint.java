package datatypes;

import terms.*;

public class Tint extends Type {

	public Tint() {
		super(TType.INT);
	}

	@Override
	public String toString() {
		return "int";
	}

	@Override
	public boolean basic() {
		return true;
	}

	@Override
	public String rhsString() {
		return toString();
	}

	@Override
	public Term zero() {
		return new IntC(0);
	}

}
