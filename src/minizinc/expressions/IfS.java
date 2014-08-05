package minizinc.expressions;

import java.util.Arrays;
import java.util.List;

import terms.Term;
import Path.Path;

public class IfS extends Expr {
	private Expr Cond;
	private Expr Exp1;
	private Expr Exp2;

	public IfS(Expr cond, Expr exp1, Expr exp2) {
		Cond = cond;
		Exp1 = exp1;
		Exp2 = exp2;
	}

	/*
	@Override
	public Term simplify() {
		Term condp = Cond.simplify();
		Term exp1p = Exp1.simplify();
		Term exp2p = Exp2.simplify();
		return new IfS(condp, exp1p, exp2p);
	}
    */


	public Expr getCond() {
		return Cond;
	}

	public void setCond(Expr cond) {
		Cond = cond;
	}

	public Expr getExp1() {
		return Exp1;
	}

	public void setExp1(Expr exp1) {
		Exp1 = exp1;
	}

	public Expr getExp2() {
		return Exp2;
	}

	public void setExp2(Expr exp2) {
		Exp2 = exp2;
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
		result = prime * result + ((Cond == null) ? 0 : Cond.hashCode());
		result = prime * result + ((Exp1 == null) ? 0 : Exp1.hashCode());
		result = prime * result + ((Exp2 == null) ? 0 : Exp2.hashCode());
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
		IfS other = (IfS) obj;
		if (Cond == null) {
			if (other.Cond != null)
				return false;
		} else if (!Cond.equals(other.Cond))
			return false;
		if (Exp1 == null) {
			if (other.Exp1 != null)
				return false;
		} else if (!Exp1.equals(other.Exp1))
			return false;
		if (Exp2 == null) {
			if (other.Exp2 != null)
				return false;
		} else if (!Exp2.equals(other.Exp2))
			return false;
		return true;
	}

	@Override
	public String print() {
		return "if (" + Cond + ") then " + Exp1 + " else " + Exp2 + " endif";
	}

	@Override
	public List<? extends Expr> subexpressions() {
		return Arrays.asList(Cond, Exp1, Exp2);
	}

	/**
	 * Returns the type of the if statement. Observe that both the then and the
	 * else must have the same type, but we don't check that and simply return 
	 * the if part.
	 * @return The type of the Then Expression
	 */
	@Override
	public Type type() {
		return Exp1.type();
	}

}
