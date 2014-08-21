package transformation;

import java.util.List;

import minizinc.constraints.*;
import minizinc.representation.model.BasicModel;
import minizinc.representation.statement.Constraint;

public class TransformedProgram extends BasicModel {

	public TransformedProgram(BasicModel p) throws Exception {
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
