package terms;

import Path.Path;

public abstract class Term {
  public abstract boolean standard();
  public abstract Path getPath();
  public abstract String toString();
  public abstract boolean equals(Object other);
  public abstract int hashCode();
  public Term simplify() {
	  return this;
  }
  public boolean isBin() { return false;  }
  public boolean isVar() { return false;  }
  public boolean isShow() { return false;  }
  
}
