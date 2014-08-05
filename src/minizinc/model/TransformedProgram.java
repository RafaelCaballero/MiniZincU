package minizinc.model;

import datatypes.Type;

import java.util.List;

import minizinc.constraints.*;
import terms.*;
import transformation.*;

public class TransformedProgram extends Model {

	public TransformedProgram(Model p) throws Exception {
		List<Var> lv = p.getVar();
		List<Constraint> ctrs = p.getCtrs();

		Transform tr = new Transform(p);

		for (Var v : lv) {
			TransVar tv = tr.transvar(v);
			for (Var x : tv.getVar()) {
				String name = x.getName();
				Type t = x.getT();
				add(new SVar(name, t, 0));
			}
			// addCtr(tv.getCtr());
			add(tv.getCtr());
			// System.out.println("--------Ctr: "+getCtr());
		}

		// transform constraints
		Constraint cp;
		for (Constraint ctr : ctrs) {
			cp = tr.transCons(ctr);
			add(cp);
		}

		// transform output

		/*
		 * for (Term t:p.getOutput()){ Term ts = tr.transShow(t);
		 * getOutput().add(ts); }
		 */

	}

}
