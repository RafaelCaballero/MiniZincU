package datatypes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
 * Data constructor with its parameters
 */
public class Tcons {
	private String cons;
	private List<Type> subtypes;

	public Tcons(String cons) {
		this.cons = cons;
		this.subtypes = new ArrayList<Type>();
		;
	}

	public void add(Type t) {
		subtypes.add(t);
	}

	public Tcons(String cons, List<Type> subtypes) {
		this.cons = cons;
		this.subtypes = subtypes;
	}

	public String toString() {
		String s = "";
		Iterator<Type> it = subtypes.iterator();
		while (it.hasNext()) {
			s += it.next().rhsString() + (it.hasNext() ? "," : "");
		}
		if (s.equals(""))
			s = cons;
		else
			s = cons + "(" + s + ")";
		return s;
	}

	public String getCons() {
		return cons;
	}

	public List<Type> getSubtypes() {
		return subtypes;
	}

	public void setSubtypes(List<Type> subtypes) {
		this.subtypes = subtypes;
	}

	public void setCons(String cons) {
		this.cons = cons;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		Tcons c = (Tcons) obj;
		return cons != null && c.cons != null && cons.equals(c.cons);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cons == null) ? 0 : cons.hashCode());
		return result;
	}

}
