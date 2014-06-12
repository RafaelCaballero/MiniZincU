package terms;

import Path.Path;
import datatypes.Type;

public class Var extends Term {
	private Type t;
	private String name;
	private int level;
	

	public Var(String name, Type t, int level) {
		this.t = t;
		this.name = name;
		this.level = level;
	}
	
	public Var(Type t, String name) {
		this.t = t;
		this.name = name;
		this.level = 0;
	}
	
	@Override
	public  boolean standard() {
		return t.basic();
	}

	
	@Override
	public  boolean isVar() {
		return true;
	}

	
	public Type getT() {
		return t;
	}
	public void setT(Type t) {
		this.t = t;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
	public String varDecl() {
		String s="";
		s = "var "+t.rhsString();
		if (level!=0) s+="("+level+")";
		s+=": "+name+";";
		return s;		
	}
   
	@Override
	public String toString() {
		String s="";
		s =name;
		return s;		
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
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Var other = (Var) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


}
