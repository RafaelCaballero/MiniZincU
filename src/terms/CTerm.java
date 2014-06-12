package terms;

import java.util.ArrayList;
import java.util.List;

import Path.Path;


public class CTerm extends Term{
	private String cons;
	private List<Term> args;
	
	@Override
	public  boolean standard() {
		return false;
	}

	public String getCons() {
		return cons;
	}

	@Override
	public Term simplify() {
		 List<Term> args2 = new ArrayList<Term>();
  		 int n = args.size();
		 for (int i=0; i<n; i++) {
			 args2.add(args.get(i).simplify());
		 }
		
		 
		 CTerm t = new CTerm();
		 t.setCons(cons);
		 t.setArgs(args2);
		 return t;
		
	}

	@Override
	public String toString() {
		String s;
		s = cons;
		int n = args.size();
		if (n>0) s += "(";
		for (int i=0; i<n; i++) {
			s += args.get(i);
			if (i<n-1) s+=", ";
		}
		if (n>0) s +=")";
		return s;
	}

	
	public void setCons(String cons) {
		this.cons = cons;
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
		result = prime * result + ((cons == null) ? 0 : cons.hashCode());
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
		CTerm other = (CTerm) obj;
		if (args == null) {
			if (other.args != null)
				return false;
		} else if (!args.equals(other.args))
			return false;
		if (cons == null) {
			if (other.cons != null)
				return false;
		} else if (!cons.equals(other.cons))
			return false;
		return true;
	}


}
