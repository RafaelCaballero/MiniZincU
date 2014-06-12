package terms;

import Path.Path;


public class Show  extends Term{
	private Var t;
	public Show(Var t) {
		this.t = t;
	}
	public Var getT() {
		return t;
	}
	public void setT(Var t) {
		this.t = t;
	}
	@Override
	public  Term simplify(){
		return t;
	}
	@Override
	public  String toString(){
		String s = "show("+t+")";
		return s;
	}
	@Override
	public boolean standard() {
		return t.standard();
	}
	
	@Override
	public boolean isShow() {
		return true;
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
		result = prime * result + ((t == null) ? 0 : t.hashCode());
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
		Show other = (Show) obj;
		if (t == null) {
			if (other.t != null)
				return false;
		} else if (!t.equals(other.t))
			return false;
		return true;
	}


}
