package datatypes;
import terms.*;

public class Tbool extends Type {

	public Tbool() {
		super(TType.BOOL);
	}
	
	@Override
	public String rhsString() {
		return toString();	
	}

	@Override
	public Term zero() {
		// TODO Auto-generated method stub
		return new BoolC(false);
	}


	@Override
	public boolean basic() {
		return true;
	}

	@Override
	public String toString() {
		return "bool";
	}

}
