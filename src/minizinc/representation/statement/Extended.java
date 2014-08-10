package minizinc.representation.statement;

import java.util.List;

import minizinc.representation.expressions.Expr;
import datatypes.Textension;


public class Extended extends Statement {
	private Textension dataName;
	private String baseName;
	private List<String> left;
	private List<String> right;

	public Extended(String name) {
		super(TStatement.EXTENDED);
		dataName = new Textension(name);
		this.baseName = null;
		left = right = null;
	}

	public Extended(String name, String baseName, List<String> left,
			List<String> right) {
		super(TStatement.EXTENDED);

		dataName = new Textension(name);
		this.baseName = baseName;
		this.left = left;
		this.right = right;
	}

	public String print() {
		String s = "";
		String sl = listToString(left);
		String sr = listToString(right);

		s = "extended " + dataName + " = " + sl
				+ (sl.length() == 0 ? "" : "++") + baseName
				+ (sr.length() == 0 ? "" : "++") + sr;

		return s;
	}

	private String listToString(List<String> l) {
		String s = "";
		boolean empty = true;
		for (String ls : l) {
			if (empty)
				s = "[";
			else
				s = ", ";
			empty = false;
			s += ls;
		}
		if (!empty)
			s = "]";
		return s;
	}

	/**
	 * @return the dataName
	 */
	public Textension getDataName() {
		return dataName;
	}

	/**
	 * @param dataName
	 *            the dataName to set
	 */
	public void setDataName(Textension dataName) {
		this.dataName = dataName;
	}

	/**
	 * @return the baseName
	 */
	public String getBaseName() {
		return baseName;
	}

	/**
	 * @param baseName
	 *            the baseName to set
	 */
	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}

	/**
	 * @return the left
	 */
	public List<String> getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(List<String> left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public List<String> getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(List<String> right) {
		this.right = right;
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
		result = prime * result
				+ ((baseName == null) ? 0 : baseName.hashCode());
		result = prime * result
				+ ((dataName == null) ? 0 : dataName.hashCode());
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
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
		Extended other = (Extended) obj;
		if (baseName == null) {
			if (other.baseName != null)
				return false;
		} else if (!baseName.equals(other.baseName))
			return false;
		if (dataName == null) {
			if (other.dataName != null)
				return false;
		} else if (!dataName.equals(other.dataName))
			return false;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		return true;
	}



	@Override
	public List<Expr> subexpressions() {
		// TODO Auto-generated method stub
		return null;
	}

}
