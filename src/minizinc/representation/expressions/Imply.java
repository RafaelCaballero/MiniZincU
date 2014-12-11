package minizinc.representation.expressions;

public class Imply extends InfixExpr {

	public Imply(Expr e1, Expr e2) {
		super("->", e1, e2);
	}

	public boolean isTrue() {
		boolean r = false;
		Expr e1 = this.e.get(0);
		Expr e2 = this.e.get(1);
		if (e1.equals(new BoolC(false)) || e2.equals(new BoolC(true)))
			r = true;
		return r;
	}

	@Override
	public String print() {
		Expr e1 = this.e.get(0);
		Expr e2 = this.e.get(1);
		;
		String s = "(" + e1.print() + " -> " + e2.print() + ")";
		return s;
	}

	@Override
	public Expr simplify() {
		Expr r = this;
		Expr e1 = this.e.get(0).simplify();
		Expr e2 = this.e.get(1).simplify();
		if (e1 instanceof BoolC) {
			BoolC lv = (BoolC) e1;
			// false -> p equivalent to true
			if (lv.getValue() == false)
				r = new BoolC(true);
			else
				// true --> equivalent to p
				r = e2;
		} else if (e2 instanceof BoolC) {
			BoolC lv = (BoolC) e2;
			// p -> false equivalent to not p
			if (lv.getValue() == false)
				r = new NotBoolExpr(e1);
			else
				// p -> true equivalent to true
				r = new BoolC(true);

		} else {
			if (!this.e.get(0).equals(e1)) {
				// replace the element 0 by e1
				e.add(0, e1);
				e.remove(1);
			}
			if (!this.e.get(1).equals(e2)) {
				// replace the element 1 by e2
				e.add(1, e2);
				e.remove(2);
			}
		}
		return r;
	}

}
