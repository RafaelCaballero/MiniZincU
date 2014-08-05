/**
 * 
 */
package datatypes;

import terms.Term;

/**
 * @author sameson
 *
 */
public abstract class Type {
	private TType type;

	public Type(TType type) {
		this.type = type;
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
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Type other = (Type) obj;
		if (type != other.type)
			return false;
		return true;
	}

	public TType getType() {
		return type;
	}

	public void setType(TType type) {
		this.type = type;
	}

	public abstract String rhsString();

	public abstract Term zero();

	public abstract boolean basic();
}
