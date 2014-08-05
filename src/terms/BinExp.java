package terms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Path.Path;

public class BinExp extends Term {

	protected String op;
	protected Term t1;
	protected Term t2;

	public BinExp() {

	}

	public BinExp(String op, Term t1, Term t2) {
		this.op = op;
		this.t1 = t1;
		this.t2 = t2;
	}

	// fold constructors

	public BinExp(String op, List<Term> lt) {
		fold(op, lt, lt.size());
	}

	public BinExp(String op, List<Term> lt, int n) {
		fold(op, lt, n);
	}

	public void fold(String op, List<Term> lt, int n) {
		this.op = op;
		if (n <= 1) {
			t1 = null;
			t2 = null;
		} else if (n == 2) {
			this.t1 = lt.get(0);
			this.t2 = lt.get(1);
		} else {
			this.t2 = lt.get(n - 1);
			this.t1 = new BinExp(op, lt, n - 1);
		}

	}

	@Override
	public boolean standard() {
		return true;
	}

	@Override
	public String toString() {
		return "(" + t1 + " " + op + " " + t2 + ")";
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public Term getT1() {
		return t1;
	}

	public void setT1(Term t1) {
		this.t1 = t1;
	}

	public Term getT2() {
		return t2;
	}

	public void setT2(Term t2) {
		this.t2 = t2;
	}

	@Override
	public Path getPath() {
		// TODO Auto-generated method stub
		return null;
	}

	public Term simplify() {
		Term t1p = t1.simplify();
		Term t2p = t2.simplify();
		return new BinExp(this.op, t1p, t2p);
	}

	@Override
	public boolean isBin() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((op == null) ? 0 : op.hashCode());
		result = prime * result + ((t1 == null) ? 0 : t1.hashCode());
		result = prime * result + ((t2 == null) ? 0 : t2.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BinExp other = (BinExp) obj;
		if (op == null) {
			if (other.op != null)
				return false;
		} else if (!op.equals(other.op))
			return false;
		if (t1 == null) {
			if (other.t1 != null)
				return false;
		} else if (!t1.equals(other.t1))
			return false;
		if (t2 == null) {
			if (other.t2 != null)
				return false;
		} else if (!t2.equals(other.t2))
			return false;
		return true;
	}

}
