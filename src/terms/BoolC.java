package terms;

import Path.Path;

public class BoolC extends Term {
	private boolean value;
	
	
	public BoolC(boolean i) {
		value = i;
	}


	@Override
	public  boolean standard() {
		return true;
	}


	public boolean getValue() {
		return value;
	}


	public void setValue(boolean value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return ""+value;
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
		result = prime * result + (value ? 1231 : 1237);
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
		BoolC other = (BoolC) obj;
		if (value != other.value)
			return false;
		return true;
	}

}
