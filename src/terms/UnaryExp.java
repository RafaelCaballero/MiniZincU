package terms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Path.Path;

public class UnaryExp extends Term {
	private String op;
	private Term t1;

	public UnaryExp(String op, Term t1) {
		this.op = op;
		this.t1 = t1;
	}

	@Override
	public boolean standard() {
		return true;
	}

	@Override
	public Term simplify() {
		Term t1p = t1.simplify();
		return new UnaryExp(this.op, t1p);
	}

	@Override
	public String toString() {
		return op + "(" + t1 + ")";
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

	@Override
	public Path getPath() {
		// TODO Auto-generated method stub
		return null;
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
		UnaryExp other = (UnaryExp) obj;
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
		return true;
	}

}
