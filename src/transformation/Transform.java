package transformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import minizinc.representation.DataDef.*;
import minizinc.representation.expressions.BoolC;
import minizinc.representation.expressions.IfS;
import minizinc.representation.model.Model;
import minizinc.representation.statement.Constraint;
import minizinc.representation.statement.DataDef;
import Path.Path;
import terms.*;

public class Transform {
	private Model p;

	public Transform(Model p) {
		this.p = p;
	}

	public Set<String> getPath(Term t) {
		Set<String> path = null;

		return path;

	}

	public TransVar transvar(Var v) throws Exception {
		TransVar result = new TransVar();

		if (v.getT().basic())
			result.getVar().add(v);
		else {
			String typename = v.getT().rhsString();

			DataDef d = p.getDataByName(typename);
			if (d == null)
				throw new Exception("Unexpected union type name " + typename);
			else
				result = transvarAux(v, d);

		}
		return result;
	}

	private TransVar transvarAux(Var v, DataDef d) throws Exception {
		TransVar result = new TransVar();

		int size = d.getCons().size();
		Trange newt = new Trange(1, size);
		Var nv = new Var(v.getName(), newt, 0);
		TransVar ntv = new TransVar();
		ntv.getVar().add(nv);
		if (v.getLevel() <= 0) {
			List<Term> lt = new ArrayList<Term>();
			for (int i = 0; i < size; i++) {
				int nconst = d.getCons().get(i).getSubtypes().size();
				if (nconst > 0) {
					IntC iplus1 = new IntC(i + 1);
					BinExp neq = new BinExp("!=", nv, iplus1);
					lt.add(neq);
				}
			}
			Term beand = createAnd(lt);
			ntv.setCtr(new Constraint(beand.simplify()));
		} else {
			// n>0

			// recursive calls
			List<List<TransVar>> recursive = recursiveCalls(v, d, size);

			List<Term> bigCtrl = new ArrayList<Term>();
			// create Transvar
			for (int i = 0; i < size; i++) {
				List<TransVar> auxrec = recursive.get(i);
				IntC iplus1 = new IntC(i + 1);
				BinExp neq = new BinExp("!=", nv, iplus1);
				BinExp eq = new BinExp("=", nv, iplus1);

				List<Term> c1Auxl = new ArrayList<Term>();
				List<Term> c2Auxl = new ArrayList<Term>();

				for (TransVar j : auxrec) {
					// incorporate new variables
					ntv.getVar().addAll(j.getVar());
					c2Auxl.add(j.getCtr().getTerm());
					List<Term> czl = new ArrayList<Term>();
					for (Var vz : j.getVar()) {
						BinExp zeq = new BinExp("=", vz, vz.getT().zero());
						czl.add(zeq);

					}
					Term cz = createAnd(czl);
					c1Auxl.add(cz);

				}

				Term c1Aux = createAnd(c1Auxl);
				Term c2Aux = createAnd(c2Auxl);
				Imply c1 = new Imply(neq, c1Aux);
				Imply c2 = new Imply(eq, c2Aux);
				boolean b1 = !c1.isTrue();
				boolean b2 = !c2.isTrue();

				if (b1 || b2) {
					Term c = null;
					if (b1 && b2)
						c = new And(c1, c2);
					else if (b1)
						c = c1;
					else
						c = c2;
					bigCtrl.add(c);
				}

			}
			And bigCtre = new And(bigCtrl);
			Constraint bigCtr = new Constraint(bigCtre.simplify());
			ntv.setCtr(bigCtr);

		}
		result = ntv;

		return result;
	}

	public Term createAnd(List<Term> l) {
		Term t = null;
		List<Term> lp = new ArrayList<Term>();
		Term tip;
		for (int i = 0; i < l.size(); i++) {
			tip = l.get(i).simplify();
			if (!tip.equals(new BoolC(true)))
				lp.add(tip);
		}

		if (lp.size() == 0)
			t = new BoolC(true);
		else if (lp.size() == 1)
			t = lp.get(0);
		else
			t = new And(lp);

		return t;
	}

	public static String newVarName(String name, int i, int j) {
		return name + "_" + i + "_" + j;
	}

	private List<List<TransVar>> recursiveCalls(Var v, DataDef d, int size)
			throws Exception {
		List<List<TransVar>> result = new ArrayList<List<TransVar>>();
		int l = v.getLevel() - 1;
		for (int i = 0; i < size; i++) {
			int nconst = d.getCons().get(i).getSubtypes().size();
			List<TransVar> auxrec = new ArrayList<TransVar>();
			for (int j = 0; j < nconst; j++) {
				String newname = newVarName(v.getName(), (i + 1), (j + 1));
				Type t = d.getCons().get(i).getSubtypes().get(j);
				Var varaux = new Var(newname, t, l);
				TransVar x = transvar(varaux);
				auxrec.add(x);
			}
			result.add(auxrec);
		}
		return result;
	}

	// transforming constraints
	public Constraint transCons(Constraint c) {
		Constraint cp = c;
		Term t = c.getTerm();
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

	public Term transShow(Term t) throws Exception {
		Term st = null;

		if (t.isVar())
			st = new Show((Var) t);
		else if (t.isShow())
			if (t.standard())
				st = t;
			else {
				Var v = ((Show) t).getT();
				st = sVar(v, v.getLevel());
				// System.out.println(v.getName()+"===> "+st+"");
			}
		else {
			/*
			 * CTerm ct = (CTerm)t; Term Left = new StringC(ct.getCons()); Term
			 * aux = null; for (Term Arg:ct.getArgs()) { Term trec =
			 * transShow(Arg); aux = Left; Left = new BinExp("++", aux, trec); }
			 * st = Left;
			 */
			st = t;
		}

		return st;

	}

	private Term sVar(Var v, int l) throws Exception {
		Term t = null;

		String typename = v.getT().rhsString();
		DataDef d = p.getDataByName(typename);
		if (d == null)
			throw new Exception("(sVar) Unexpected union type name " + typename);
		else {
			int n = d.getCons().size();
			t = sVari(d, v, l, 0, n);
			/*
			 * List<Term> ls = new ArrayList<Term>(); ls.add(new
			 * StringC(v.getName()) ); ls.add(new StringC(": ") );
			 * ls.add(sVari(d,v,l,0,n)); ls.add(new StringC("\n ") ); t = new
			 * BinExp("++",ls);
			 */
		}

		return t;
	}

	private Term sVari(DataDef d, Var v, int l, int i, int n) throws Exception {
		Term t = null;
		DataCons c = d.getCons().get(i);
		int m = c.getSubtypes().size();
		Term sThen;

		if (l == 0 && m > 0) {
			if (i < n - 1)
				t = sVari(d, v, l, i + 1, n);
		} else {
			// obtaining sThen
			sThen = new StringC(c.getCons());
			{
				if (m != 0) {
					BinExp sAux = null;
					sThen = new BinExp("++", sThen, new StringC("("));
					for (int j = 0; j < m; j++) {
						Type tipi = c.getSubtypes().get(j);
						String name = newVarName(v.getName(), i + 1, j + 1);
						Var newVar = new Var(name, tipi, l - 1);
						Term term = transShow(newVar);
						if (term != null) {

							sAux = new BinExp("++", sThen, new BinExp("++",
									new StringC(" "), term));
							if (j < m - 1)
								sThen = new BinExp("++", sAux, new StringC(","));
							else
								sThen = sAux;
						}
					}
					sThen = new BinExp("++", sThen, new StringC(")"));

				}
			} // end obtaining sThen

			// if condition
			// first fix
			SPredicate fix = new SPredicate("fix");
			fix.add(v);
			IntC ti = new IntC(i + 1);
			BinExp cond = new BinExp("=", fix, ti);

			if (i == n - 1) {
				t = new IfS(cond, sThen, new StringC(""));
			} else {
				Term ts = sVari(d, v, l, i + 1, n);
				if (ts == null)
					t = new IfS(cond, sThen, new StringC(""));
				else
					t = new IfS(cond, sThen, ts);
			}
		}
		return t;

	}

}