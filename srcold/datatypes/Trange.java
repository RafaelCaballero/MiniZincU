package datatypes;

import terms.*;

public class Trange extends Type {

	private int start;
	private int end;
	
	public Trange(int a, int b) {
		super(TType.RANGE);
		start = a;
		end = b;
	}
		
	@Override
	public String rhsString() {
		return toString();
	}
	
	@Override
	public  boolean basic() {
		return true;
	}

	@Override
	public String toString() {
		return start+".."+end;
	}
	
	@Override
	public Term zero() {
		return new IntC(start);
	}


}
