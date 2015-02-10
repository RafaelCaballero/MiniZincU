package minizinc.representation.expressions;

import java.util.List;

/**
 * Represents the conjunction of two or more expressions
 * 
 * @author rafa
 *
 */
public class And extends InfixExpr {

	public And(Expr e1, Expr e2) {
		super("/\\", e1, e2);
		//simplify();
	}

	public And(List<? extends Expr> e) {
		super("/\\", e);
		//simplify();
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
		} else
		// if it constains a true, remove it
		if (removeTrue())
			changed = true;
		else {
			// simplify elements
			for (int j = 0; j < e.size(); j++) {
				// simplify the j-th element
				Expr expj = e.get(j);
				Expr exp = expj.simplify();
				if (!exp.equals(expj)) {
					e.add(j, exp);
					e.remove(j + 1);
					changed = true;
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

	/**
	 * Removes values true
	 * 
	 * @return true if some element has been removed
	 */
	private boolean removeTrue() {
		int nRemoved = 0;
		if (e != null && e.size() > 1) {
			int n = e.size();
			for (int i = 0; nRemoved != n - 1 && i < e.size();) {
				Expr ej = e.get(i);
				if (ej instanceof BoolC && ((BoolC) ej).getValue()){
					e.remove(i);
					nRemoved++;
				}
				else
					i++;
			}
		}

		return nRemoved > 0;
	}

	private boolean containsFalse() {
		boolean r = false;
		for (int i = 0; i < e.size() && !r; i++) {
			Expr es = e.get(i);
			if (es instanceof BoolC) {
				BoolC lv = (BoolC) es;
				if (lv.getValue() == false)
					r = true;
			}
		}

		return r;

	}

}
