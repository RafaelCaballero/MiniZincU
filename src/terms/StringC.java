package terms;

import Path.Path;

public class StringC extends Term {
    private String s;

    public StringC(String s) {
    	this.s=s;
    }
    public StringC(Term s) {
    	this.s= ""+s;
    }
	@Override
	public boolean standard() {
		return true;
	}


	@Override
	public String toString() {
		return  s ;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
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
		result = prime * result + ((s == null) ? 0 : s.hashCode());
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
		StringC other = (StringC) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}
	
	

}
