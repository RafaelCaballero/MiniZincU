package terms;

import java.util.List;

import minizinc.representation.expressions.BoolC;

public class And extends BinExp {
	public And(Term t1, Term t2) {
		super("/\\", t1, t2);
	}

	public And(List<Term> l) {
		super();
		setOp("/\\");
		if (l.size() == 0) {
			setT1(new BoolC(true));
			setT2(new BoolC(true));
		} else if (l.size() == 1) {
			setT1(l.get(0));
			setT2(new BoolC(true));
		} else {
			fold("/\\", l, l.size());
		}
	}

	@Override
	public Term simplify() {
		Term t = this;
		Term t1p = t1.simplify();
		Term t2p = t2.simplify();
		if (t1p.equals(new BoolC(false)))
			t = new BoolC(false);
		else if (t2p.equals(new BoolC(false)))
			t = new BoolC(false);
		else if (t1p.equals(new BoolC(false)) && t2p.equals(new BoolC(true)))
			t = new BoolC(true);
		return t;
	}
}
