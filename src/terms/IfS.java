package terms;

import Path.Path;

public class IfS extends Term {
	Term Cond;
	Term Exp1;
	Term Exp2;

	public IfS() {
		
	}
	
	
	
	public IfS(Term cond, Term exp1, Term exp2) {
		Cond = cond;
		Exp1 = exp1;
		Exp2 = exp2;
	}

	@Override
	public Term simplify() {
		Term condp = Cond.simplify();
		Term exp1p = Exp1.simplify();
		Term exp2p = Exp2.simplify();
		return new IfS(condp, exp1p, exp2p);
	}

	@Override
	public boolean standard() {	
		return true;
	}

	
	@Override
	public String toString() {	
		return "if ("+Cond+") then "+Exp1+" else "+Exp2+" endif";
	}



	public Term getCond() {
		return Cond;
	}



	public void setCond(Term cond) {
		Cond = cond;
	}



	public Term getExp1() {
		return Exp1;
	}



	public void setExp1(Term exp1) {
		Exp1 = exp1;
	}



	public Term getExp2() {
		return Exp2;
	}



	public void setExp2(Term exp2) {
		Exp2 = exp2;
	}



	@Override
	public Path getPath() {
		// TODO Auto-generated method stub
		return null;
	}



	/* (non-Javadoc)
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



	/* (non-Javadoc)
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


}
