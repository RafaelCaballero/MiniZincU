package transformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import minizinc.representation.TypeName;
import minizinc.representation.DataDef.*;
import minizinc.representation.expressions.*;
import minizinc.representation.model.Model;
import minizinc.representation.statement.Constraint;
import minizinc.representation.statement.DataDef;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeID;
import minizinc.representation.types.TypeRange;
import minizinc.representation.types.TypeUnion;
import Path.Path;

public class Transform {
	private Model p;

	public Transform(Model p) {
		this.p = p;
	}




	// transforming constraints
	public Constraint transCons(Constraint c) {
		Constraint cp = c;
		Expr t = c.getExpr();
		if (t.isBin()) {
			BinExp tb = (BinExp) t;
			Term ct = null;
			if ((tb.getOp().equals("=") || tb.getOp().equals("!="))
					&& !tb.getT1().standard() && !tb.getT2().standard()) {
				if (isUnionVar(tb.getT1())) {
					if (isUnionVar(tb.getT2()))
						ct = eqVars((Var) tb.getT1(), (Var) tb.getT2());
					/*
					 * else // var = cte ct = eqVarCt((Var)tb.getT1(),
					 * (CTerm)tb.getT2());
					 */
				}

				if (tb.getOp().equals("="))
					cp = new Constraint(ct);
				else
					cp = new Constraint(new UnaryExp("not", ct));

				// System.out.println("****"+cp.toString()+"****");
			}

		}
		return cp;
	}

	// the term corresponds to an union variable?
	private boolean isUnionVar(Term t) {
		return t.isVar() && ((Var) t).getT().getType() == TType.UNION;
	}

	// generate expression v1=v2
	private Term eqVars(Var v1, Var v2) {
		Term t = null;
		if (v1.getT().rhsString().equals(v2.getT().rhsString())) {
			try {
				TransVar tv1 = transvar(v1);
				TransVar tv2 = transvar(v2);
				List<Var> l1 = tv1.getVar();
				List<Var> l2 = tv2.getVar();
				List<Term> lt = new ArrayList<Term>();
				for (Var aux1 : l1) {
					// change the prefix
					String aux1s = aux1.getName();
					String aux1s2 = aux1s.replaceFirst(v1.getName(),
							v2.getName());
					// System.out.println(aux1s+"==>"+aux1s2);
					Var aux2 = new Var(aux1s2, aux1.getT(), aux1.getLevel());
					if (l2.contains(aux2)) {
						lt.add(new BinExp("=", aux1, aux2));
					}
				}
				t = createAnd(lt);

			} catch (Exception e) {
				System.out
						.println("Unexpected error comparing union variables "
								+ v1.getName() + " of type "
								+ v1.getT().rhsString() + " and "
								+ v2.getName() + " of type "
								+ v2.getT().rhsString());
			}

		} else
			System.out.println("Error comparing union variables "
					+ v1.getName() + " of type " + v1.getT().rhsString()
					+ " and " + v2.getName() + " of type "
					+ v2.getT().rhsString());
		return t;
	}

	private Term eqVarCt(Var x, CTerm c) {
		Term t = null;
		Path p = null;
		return t;

	}


}