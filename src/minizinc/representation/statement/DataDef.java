package minizinc.representation.statement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import minizinc.representation.expressions.Expr;
import datatypes.Tcons;
import datatypes.Tunion;
import datatypes.Type;

/*
 * Data declaration.
 */
public class DataDef extends Statement {
	private Tunion dataName;
	private List<Tcons> cons;

	public DataDef(String dataName) {
		super(TStatement.DATA);
		this.dataName = new Tunion(dataName);
		cons = new ArrayList<Tcons>();
	}

	public void addCons(String consName) {
		Tcons c = new Tcons(consName);
		cons.add(c);
	}

	public void addCons(Tcons c) {
		cons.add(c);
	}

	public Tcons getConsByName(String name) {
		Tcons c = null;
		for (Tcons cp : cons)
			if (cp.getCons().equals(name))
				c = cp;
		return c;
	}

	// returns the position of the constraint
	public int addSubtype(String consName, Type t) {
		int r;
		r = cons.indexOf(new Tcons(consName));

		if (r != -1)
			(cons.get(r)).add(t);

		return r;
	}

	public List<Tcons> getCons() {
		return cons;
	}

	public void setCons(List<Tcons> cons) {
		this.cons = cons;
	}

	public Tunion getDataName() {
		return dataName;
	}

	public void setDataName(Tunion dataName) {
		this.dataName = dataName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		DataDef c = (DataDef) obj;
		return dataName != null && c.dataName != null
				&& dataName.equals(c.dataName);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataName == null) ? 0 : dataName.hashCode());
		return result;
	}


	@Override
	public String print() {
		String s = "";

		Iterator<Tcons> it = cons.iterator();
		while (it.hasNext()) {
			s += it.next() + (it.hasNext() ? " , " : "};");
		}

		return "enum " + dataName.rhsString() + "= {" + s;
	}

	@Override
	public List<Expr> subexpressions() {
		// a data/union declaration contains no subexpressions
		return null;
	}

}
