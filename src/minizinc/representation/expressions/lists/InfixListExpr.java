/**
 * 
 */
package minizinc.representation.expressions.lists;

import transformation.ExprTransformer;
import minizinc.representation.TypeName;

/**
 * A list expression of the form e1 op e2, with e1 and e2 lists expressions and
 * op an operator like "++"
 * 
 * @author rafa
 *
 */
public class InfixListExpr extends ListExpr {
	private ListExpr e1;
	private ListExpr e2;
	private String op;

	public InfixListExpr(String op, ListExpr t0, ListExpr t1) {
		this.e1 = t0;
		this.e2 = t1;
		this.op = op;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return e1.print() + " " + op + " " + e2.print();
	}

	@Override
	public TypeName type() {
		// this can be complex in the type of expressions
		// At the moment just a naive (possibly incorrect) version: the type of
		// an operator
		return e1.type();
	}

	@Override
	public InfixListExpr clone() {
		InfixListExpr r = null;
		ListExpr e1p = e1 == null ? null : e1.clone();
		ListExpr e2p = e2 == null ? null : e2.clone();
		;
		String opp = op;
		r = new InfixListExpr(opp, e1p, e2p);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((e1 == null) ? 0 : e1.hashCode());
		result = prime * result + ((e2 == null) ? 0 : e2.hashCode());
		result = prime * result + ((op == null) ? 0 : op.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfixListExpr other = (InfixListExpr) obj;
		if (e1 == null) {
			if (other.e1 != null)
				return false;
		} else if (!e1.equals(other.e1))
			return false;
		if (e2 == null) {
			if (other.e2 != null)
				return false;
		} else if (!e2.equals(other.e2))
			return false;
		if (op == null) {
			if (other.op != null)
				return false;
		} else if (!op.equals(other.op))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		ListExpr e1p = this.applyTransformer2(t, e1);
		ListExpr e2p = this.applyTransformer2(t, e2);
		e1 = e1p;
		e2 = e2p;
	}

}
