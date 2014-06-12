package program;

import datatypes.Type;
import java.util.List;

import terms.*;
import constraints.*;
import transformation.*;



public class TransformedProgram extends Program {
	
	public TransformedProgram(ProgramU p) throws Exception {
		List<Var> lv = p.getVar();
		List<Constraint> ctrs = p.getCtrs();
		
		Transform tr = new Transform(p);
		
		for (Var v:lv){
			TransVar tv = tr.transvar(v);
			for (Var x:tv.getVar()) {
				String name = x.getName();
				Type t = x.getT();
				addVar(new Var(name,t,0));
			}
			//addCtr(tv.getCtr());
			addCtr(tv.getCtr());
			//System.out.println("--------Ctr: "+getCtr());
		}
		
		// transform constraints
		Constraint cp;
		for (Constraint ctr:ctrs) {
			cp = tr.transCons(ctr);
			addCtr(cp);
		}
		
		// transform output
		for (Term t:p.getOutput()){
			Term ts = tr.transShow(t);
			getOutput().add(ts);
		}
		
		
	}
	

}
