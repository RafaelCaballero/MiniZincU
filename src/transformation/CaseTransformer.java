/**
 * 
 */
package transformation;

import java.util.ArrayList;
import java.util.List;

import transformation.pattern.PatternMatching;
import minizinc.representation.expressions.*;
import minizinc.representation.expressions.cases.Branch;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.TypeUnion;

/**
 * Transforms case expressions
 * 
 * @author rafa
 *
 */
public class CaseTransformer {
	protected SplitModel m;
	protected CaseExpr e;

	/**
	 * 
	 */
	public CaseTransformer(SplitModel m, CaseExpr e) {
		this.m = m;
		this.e = e;
	}

	/**
	 * 
	 * @return The transformation of the case expression
	 */
	public Expr transform() {
		Expr r = null;
		// all the cases in the case statement
		List<Branch> lb = e.getBranches();
		Expr id = e.getId();
		boolean ok = true;

		// check if the case argument is a variable
		VarDecl vd = null;
		if (id != null && id instanceof ID) {
			vd = getVarByName((ID) id);

			// le is the list of transformed case expressions
			List<Expr> le = new ArrayList<Expr>(lb.size());
			for (Branch b : lb) {
				// transform branch b
				Expr bt = transform(id, vd, b);
				if (bt != null)
					le.add(bt);
				else
					ok = false;
			}

			if (ok)
				// the result is the and of all the transformed expressions
				r = new Or(le);
		}
		return r;
	}

	/**
	 * Gets the variable declaration corresponding to the closest ancestor of
	 * the identifier. The problem is that the identifier can be for instance
	 * t_2_3, but only t exists as a declaration (t_2_3 will be generated
	 * later). In this case the declaration of t is employed and the level and
	 * type of t_2_3 is obtained. In general the name can be of the form
	 * t_i1_j1_...._in_jn
	 * 
	 * @param id
	 *            Identifier corresponding to the variable.
	 * @return
	 */
	private VarDecl getVarByName(ID id) {
		String name = id.print();
		VarDecl r = null;
		r = m.getVarByName(id);
		if (r == null) {
			String idp = id.print();
			// look for the prefix before the '_'
			int pos = idp.indexOf('_');
			if (pos != -1) {
				String s = name.substring(0, pos);
				ID ids = new ID(s);
				r = m.getVarByName(ids);
				if (r != null && r.getDeclType() instanceof TypeUnion) {
					int level = r.getLevel();
					TypeUnion dr = (TypeUnion) r.getDeclType();
					// if (r.getDeclType() != null
					int n = 0; // count the number of --
					do {
						// number of constructor
						//
						pos = idp.indexOf('_', pos + 1);
						n++;
					} while (pos != -1);
					// convert the original declaration into the declaration of
					// this
					// auxiliary variable
					// first the type
					int newlevel = level - n / 2;
					TypeUnion tu = new TypeUnion(dr.getId(), newlevel);

					r = new VarDecl(tu, id);

				}
			}
		}
		return r;
	}

	/**
	 * Transforms a case branch.
	 * 
	 * @param id
	 *            Case expression. Currently just an identifier corresponding to
	 *            a variable declaration.
	 * @param v
	 *            The variable declaration.
	 * @param b
	 *            The case branch.
	 * @return Its transformation.
	 */
	private Expr transform(Expr id, VarDecl v, Branch b) {
		Expr r = null;
		Expr expr = b.getExpr();
		PredOrUnionExpr ped = b.getPattern();
		ID cte = b.getIdpattern();

		if (cte != null) {
			// this is just transformed as the transformation of
			// 'id==cte /\ expr'
			DataExprTransformer eqTr = new DataExprTransformer(m);
			// the expression id == cte is constructed and transformed
			BoolVal bv1 = new BoolVal(cte);
			BoolVal bv2 = new BoolVal((ID) id);
			InfixBoolExpr iexpr = new InfixBoolExpr("=", bv1, bv2);
			Expr cond = eqTr.transform(iexpr);
			r = new And(cond, expr);
		} else {
			// ped is a pattern
			PatternMatching pm = new PatternMatching(m, v, ped);
			if (pm.fail())
				r = new BoolC(true);
			else {
				Substitution s = pm.getSubstitution();
				Expr exprSubs = expr.applyTransformer(s, expr);
				Expr cond = pm.getMatchingExpression();
				r = new And(cond, exprSubs);

			}

		}

		return r;
	}

}
