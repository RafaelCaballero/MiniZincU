package terms;

import java.util.List;
import java.util.ArrayList;

import Path.Path;

public  class PredicateCall extends Term {
	
	private String name;
	private  List<Term> args= new ArrayList<Term>();

	public PredicateCall(String name) {
		this.name = name;
	}
	 
	
	public PredicateCall(String name, List<Term> args) {
		this.name = name;
		this.args = args;
	}
	
	// new argument
	public void add(Term t) {
		args.add(t);
	}

	@Override
	public String toString() {
		String s;
		s = name + "(";
		int n = args.size();
		for (int i=0; i<n; i++) {
			s += args.get(i);
			if (i<n-1) s+=", ";
		}
		s +=")";
		return s;
	}
	
	
	@Override
	public boolean standard() {
		return true;
	}

	public  boolean standardPred() {
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Term> getArgs() {
		return args;
	}

	public void setArgs(List<Term> args) {
		this.args = args;
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
		result = prime * result + ((args == null) ? 0 : args.hashCode());
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
		PredicateCall other = (PredicateCall) obj;
		if (args == null) {
			if (other.args != null)
				return false;
		} else if (!args.equals(other.args))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


}
