package datatypes;
import terms.*;

public class Tfloat extends Type {

	public Tfloat() {
		super(TType.FLOAT);
	}
	
	@Override
	public String rhsString() {
		return toString();	
	}

	@Override
	public Term zero() {

		return new FloatC(0.0);
	}


	@Override
	public boolean basic() {
		return true;
	}

	@Override
	public String toString() {
		return "float";
	}

}
