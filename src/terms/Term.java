package terms;

import Path.Path;

public abstract class Term {

	/**
	 * @return is this an standard MiniZinc term?
	 */
	public boolean standard() {
		return false;
	};

	public Path getPath() {
		return null;
	};

	public abstract String toString();

	public abstract boolean equals(Object other);

	public abstract int hashCode();

	public Term simplify() {
		return this;
	}

	public boolean isBin() {
		return false;
	}

	public boolean isVar() {
		return false;
	}

	public boolean isShow() {
		return false;
	}

}
