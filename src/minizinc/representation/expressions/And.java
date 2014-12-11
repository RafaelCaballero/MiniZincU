package minizinc.representation.expressions;

import java.util.List;

/**
 * Represents the conjunction of two or more expressions
 * @author rafa
 *
 */
public class And extends InfixExpr {

	public And(Expr e1, Expr e2) {
		super("/\\", e1, e2);
	}

	public And(List<? extends Expr> e) {
		super("/\\", e);
	}

	@Override
	public Expr simplify() {

		boolean changed = false;
		Expr r = this;
		// the empty conjunction is true
		if (e == null || e.size() == 0) {
			r = new BoolC(true);
			changed = true;
		} else if (e.size() == 1) {
			r = e.get(0).simplify();
		} else
		// if it contains a false the result is false
		if (containsFalse()) {
			r = new BoolC(false);
			changed = true;
		} else {

			// simplify elements
			for (int j = 0; j < e.size(); j++) {
				Expr exp = e.get(j).simplify();
				if (!exp.equals(e.get(j))) {
					e.add(j, exp);
					e.remove(j + 1);
				}
			}

			// remove repeated values

			// position of the selected element; -1 if there is no repeated
			// element
			int i;
			for (int j = 0; j < e.size();) {
				i = -1; // at the moment no repetition has been found
				for (int jj = 0; jj < j && i == -1; jj++)
					if (e.get(j).equals(e.get(jj)))
						i = j;

				if (i != -1) {
					e.remove(i);
					changed = true;
				} else
					j++;

			}

		}
		if (changed)
			r = r.simplify();
		return r;
	}

	private boolean containsFalse() {
		boolean r = false;
		for (int i = 0; i < e.size() && !r; i++) {
			Expr es = e.get(i).simplify();
			if (es instanceof BoolC) {
				BoolC lv = (BoolC) es;
				if (lv.getValue() == false)
					r = true;
			}
		}

		return r;

	}

}
