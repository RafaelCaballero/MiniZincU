package model;

public class Statement {
    private TStatement type;
	public Statement(TStatement type) {
		this.type = type;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Statement other = (Statement) obj;
		if (type != other.type)
			return false;
		return true;
	}
	/**
	 * @return the type
	 */
	public TStatement getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(TStatement type) {
		this.type = type;
	}

}
