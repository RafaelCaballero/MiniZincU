/**
 * 
 */
package minizinc.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import minizinc.representation.statement.decls.*;

import org.antlr.v4.runtime.misc.NotNull;


/**
 * @author Rafa Caballero Represents a MiniZinc model
 */
public class Model {
	private List<Statement> stat = new ArrayList<Statement>();

	public void add(Statement s) {
		stat.add(s);
	}

	public List<VarDecl> getVar() {
		List<VarDecl> l = new ArrayList<VarDecl>();
		for (Statement s : stat)
			if (s.getType() == TStatement.VARDECL)
				l.add((VarDecl) s);
		return l;
	}

	public List<Constraint> getCtrs() {
		List<Constraint> l = new ArrayList<Constraint>();
		for (Statement s : stat)
			if (s.getType() == TStatement.CONSTRAINT)
				l.add((Constraint) s);
		return l;
	}

	/*
	 * private List<Var> var= new ArrayList<Var>(); private List<Constraint>
	 * ctrs = new ArrayList<Constraint>();
	 * 
	 * private List<Term> output = new ArrayList<Term>();
	 * 
	 * 
	 * 
	 * public Var getVarByName(String name) { Var v = null;
	 * 
	 * for (Var v2:var) { if (v2.getName().equals(name)) v = v2; }
	 * 
	 * return v; }
	 * 
	 * public void addVar(Var v) { var.add(v); } public void setVar(List<Var>
	 * var) { this.var = var; }
	 */
	@Override
	public String toString() {
		String s = "";
		for (Statement st : stat) {
			s += st.toString() + "\n";
		}

		return s;
		/*
		 * String s ="";
		 * 
		 * for(Var itv:var) { s += itv.varDecl()+"\n"; } s+="\n"; for
		 * (Constraint ctr:ctrs) { s += "constraint "+ctr+";"; s+="\n"; }
		 * s+="\nsolve satisfy;\n";
		 * 
		 * // only for debugging //showVars();
		 * 
		 * // output s+="output(["; int noutput = output.size(); for(int i=0;
		 * i<noutput; i++){ Term sh = output.get(i); s += sh; if (i<noutput-1)
		 * s+= ", "; } s+="]);"; return s;
		 */
	}

	/**
	 * Shows all the variables
	 * 
	 * private void showVars() { for(Var itv:var) { List<Term> lt =
	 * Arrays.asList(new Term[]{new StringC("\\n "), new StringC(itv.getName()),
	 * new StringC(": "), new Show(itv)});
	 * 
	 * BinExp itvs = new BinExp("++", lt, lt.size() ); output.add(new
	 * Show(itvs));
	 * 
	 * } } public List<Constraint> getCtrs() { return ctrs; }
	 * 
	 * public void setCtr(List<Constraint> ctrs) { this.ctrs = ctrs; }
	 * 
	 * public void addCtr(@NotNull Constraint ctr) { this.ctrs.add(ctr); }
	 * 
	 * 
	 * public List<Term> getOutput() { return output; }
	 * 
	 * public void setOutput(List<Term> output) { this.output = output; }
	 * 
	 * public void addOutput(Term t) { this.output.add(t); }
	 */
}
