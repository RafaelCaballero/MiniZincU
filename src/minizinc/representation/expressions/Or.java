package minizinc.representation.expressions;

import java.util.List;

/**
 * Represents the disjunction of two or more expressions
 * 
 * @author rafa
 *
 */
public class Or extends InfixExpr {

	public Or(Expr e1, Expr e2) {
		super("\\/", e1, e2);
		//simplify();
	}

	public Or(List<? extends Expr> e) {
		super("\\/", e);
		//simplify();
	}

	@Override
	public Expr simplify() {

		boolean changed = false;
		Expr r = this;

		// the empty conjunction is false
		if (e == null || e.size() == 0) {
			r = new BoolC(false);
			changed = true;
		} else if (e.size() == 1) {
			r = e.get(0).simplify();
		} else
		// if it contains a true the result is true
		if (containsTrue()) {
			r = new BoolC(true);
			changed = true;
		} else if (removeFalse())
			changed = true;
		else {

			changed = changed || simplifyElements();

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

	private boolean simplifyElements() {
		boolean changed = false;
		// simplify elements
		int j = 0;
		while (j < e.size()) {
			Expr expj = e.get(j);
			Expr exp = expj.simplify();
			// remove false values except if it is the only value in the list
			if (!(j == 0 && e.size() == 1) && exp instanceof BoolC
					&& ((BoolC) exp).getValue() == false) {
				e.remove(j);
				changed = true;
				// j is not incremented, because this has been achieved removing
				// the element
			} else if (!exp.equals(e.get(j))) {
				// replace by the simplified form
				e.add(j, exp);
				e.remove(j + 1);
				j++;
				changed = true;
			} else
				j++;
		}
		return changed;
	}

	/**
	 * Removes values false
	 * 
	 * @return true if some element has been removed
	 */
	private boolean removeFalse() {
		int nRemoved = 0;
		if (e != null && e.size() > 1) {
			int n = e.size();
			for (int i = 0; nRemoved != n - 1 && i < e.size();) {
				Expr ej = e.get(i);
				if (ej instanceof BoolC && !((BoolC) ej).getValue()){
					e.remove(i);
					nRemoved++;
				}
				else
					i++;
			}
		}

		return nRemoved > 0;
	}

	private boolean containsTrue() {
		boolean r = false;
		for (int i = 0; i < e.size() && !r; i++) {
			Expr es = e.get(i);
			if (es instanceof BoolC) {
				BoolC lv = (BoolC) es;
				if (lv.getValue() == true)
					r = true;
			}
		}

		return r;

	}

}
