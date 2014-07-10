package model;

import terms.Term;


public class SOutput extends Statement {
	Term t = null;
	public SOutput(Term t ) {
		super(TStatement.OUTPUT);
		this.t = t;
	}
	
	public String toString() {
		String s ="output(";
		if (t!=null)
		   s+=t.toString();
		s+=");";
		return s;
	}

}
