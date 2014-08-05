package terms;

import minizinc.expressions.BoolC;

public class Imply extends BinExp {
	public Imply(Term t1, Term t2) {
		super("->", t1, t2);
	}

	public boolean isTrue() {
		boolean f = false;
		if (t2.equals(new BoolC(true)))
			f = true;

		return f;
	}

	@Override
	public Term simplify() {
		Term t = this;
		Term t1p = t1.simplify();
		Term t2p = t2.simplify();
		if (t1p.equals(new BoolC(false)) || t2p.equals(new BoolC(true)))
			t = new BoolC(true);
		return t;
	}
}
