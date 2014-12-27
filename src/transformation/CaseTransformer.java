/**
 * 
 */
package transformation;

import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.scene.paint.GradientUtils.Parser;

import transformation.pattern.PatternMatching;
import minizinc.representation.Parsing;
import minizinc.representation.DataDef.DataCons;
import minizinc.representation.DataDef.DataConsData;
import minizinc.representation.expressions.*;
import minizinc.representation.expressions.cases.Branch;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.DataDef;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.Type;
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
		// System.out.println(r.print());
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
					// generate new var
					r = generateVarDecl(idp, s, pos);

				}
			}
		}
		return r;
	}

	/**
	 * generates a variable definition given its complete name {@code idp} and
	 * the prefix {@code s} which is the name of an union var that exists.
	 * Preconditions:
	 * <ul>
	 * <li>Exists a variable with name {@code s} and type union in the model
	 * {@link m}
	 * <li>The name {@code s} does not contain '_'
	 * <li> {@code s} is a prefix of {@code idp} and includes at least one '_'
	 * <li> {@code pos} corresponds to the first occurrence of '_' in {@code idp}
	 * </ul>
	 * 
	 * @param idp
	 *            long name of variable generated from s
	 * @param s
	 *            String prefix of {@link idp} which corresponds to a already
	 *            existing union variable declared in the model {@link m}
	 * @param pos
	 *            Integer indicating the position of the first "_"
	 * @return A new var declaration for idp or null if it is not possible
	 */
	private VarDecl generateVarDecl(String idp, String s, int pos) {
		// obtain the declaration of s in m.
		VarDecl r = m.getVarByName(new ID(s));

		int level = r.getLevel();
		// a precondition is a type union
		TypeUnion dr = (TypeUnion) r.getDeclType();
		ID typeId = dr.getId();
		DataDef d = m.getDataByName(typeId.print());
		// if (r.getDeclType() != null
		int n = 0; // count the number of --
		String s_narg; // string representing the arg.pos
		int narg; // the arg position
		Type argType = null; // type of the argument
		String s_ncons; // string representing the constructor position
		int ncons; // the position in the list of constructors
		DataCons dc = null; // the data constructor
		do {
			try {
				// number of constructor
				int pos2 = idp.indexOf('_', pos + 1);
				s_ncons = idp.substring(pos + 1, pos2);
				ncons = Integer.parseInt(s_ncons) - 1;
				if (d != null)
					dc = d.getCons().get(ncons);
				int pos3 = idp.indexOf('_', pos2 + 1);
				s_narg = pos3 != -1 ? idp.substring(pos2 + 1, pos3) : idp
						.substring(pos2 + 1);
				narg = Integer.parseInt(s_narg) - 1;
				if (dc != null)
					argType = dc.getSubtypes().get(narg);
				// prepare the following iteration
				n++;
				pos = pos3;
				d = m.getDataByName(argType.print());
				if (d != null)
					level--;

			} catch (NumberFormatException e) {
				Parsing.error("Unexpected internal variable format " + idp);
				pos = -1;
			}
		} while (pos != -1);
		// convert the original declaration into the declaration of
		// this
		// auxiliary variable
		// first the type
		int newlevel = level;
		Type tu = null;
		if (d != null)
			tu = new TypeUnion(new ID(d.getDataName()), newlevel);
		else
			tu = argType;
		r = new VarDecl(tu, new ID(idp));

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
		if (v == null) {
			Parsing.error("Erroneous variable " + id + " in case branch");
		} else {
			Expr expr = b.getExpr();
			PredOrUnionExpr ped = b.getPattern();
			ID cte = b.getIdpattern();

			if (cte != null) {
				// this is just transformed as the transformation of
				// 'id==cte /\ expr'
				DataEqualTransformer d = new DataEqualTransformer(m);
				DataConsData dc = m.getDataByConsName(cte.print());
				Expr cond = d.varEqualCons(v, dc);

				/*
				 * DataExprTransformer eqTr = new DataExprTransformer(m); // the
				 * expression id == cte is constructed and transformed BoolVal
				 * bv1 = new BoolVal(cte); BoolVal bv2 = new BoolVal((ID) id);
				 * InfixBoolExpr iexpr = new InfixBoolExpr("=", bv1, bv2); Expr
				 * cond = eqTr.transform(iexpr);
				 */
				r = new And(cond, expr);
			} else {
				// ped is a pattern
				PatternMatching pm = new PatternMatching(m, v, ped);
				if (pm.fail())
					r = new BoolC(false); // former true with the ->
											// transformation
				else {
					Substitution s = pm.getSubstitution();
					Expr exprSubs = expr.applyTransformer(s, expr);
					Expr cond = pm.getMatchingExpression();
					// System.out.println(cond.print());
					r = new And(cond, exprSubs);

				}

			}
		}
		return r;
	}

}
