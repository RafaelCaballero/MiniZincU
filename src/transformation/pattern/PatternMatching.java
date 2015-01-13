package transformation.pattern;

import java.util.ArrayList;
import java.util.List;

import transformation.Substitution;
import transformation.TransVar;
import minizinc.representation.Parsing;
import minizinc.representation.DataDef.DataConsData;
import minizinc.representation.expressions.And;
import minizinc.representation.expressions.BoolC;
import minizinc.representation.expressions.Equal;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.FloatC;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.IntC;
import minizinc.representation.expressions.PredOrUnionExpr;
import minizinc.representation.expressions.StringC;
import minizinc.representation.model.Model;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.DataDef;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.TypeUnion;

/**
 * Represents the pattern matching of an union variable and a pattern. The
 * variable must exist and the pattern is a term with union constructors and
 * possibly new variables. The pattern matching is very similar to that of
 * functional programming. The result is a list of equality constraints and a
 * binding of the local variables in the pattern.
 * 
 * @author rafa
 *
 */
public class PatternMatching {
	/*
	 * The equalities that represent the matching. All of them have the form v =
	 * i, v a variable, i a number.
	 */
	protected List<Equal> le;
	/*
	 * Binding obtained
	 */
	protected Substitution binding;

	/**
	 * True if the matching has been possible
	 */
	protected boolean matched;
	protected Model m;

	/**
	 * Creates the pattern matching of v and ped
	 * 
	 * @param v
	 * @param ped
	 */
	public PatternMatching(Model m, VarDecl v, PredOrUnionExpr ped) {
		this.le = null;
		this.binding = null;
		this.matched = false;
		this.m = m;
		// the variable need to be of an union type
		if (v.getDeclType() instanceof TypeUnion) {
			TypeUnion t = (TypeUnion) v.getDeclType();
			int level = v.getLevel();
			String typename = t.getId().print();
			// get the definition
			DataDef d = m.getDataByName(typename);
			if (d == null)
				Parsing.error("Only union type variables can be used in case statements "
						+ v.print());
			else {
				// use structural induction to obtain the binding and the
				// equality constraints
				matching(d, v.getID(), level, ped);
			}

		}
	}

	/**
	 * Matching of the term cd with the pattern ped
	 * 
	 * @param m
	 *            The split model
	 * @param cd
	 *            Input value
	 * @param ped
	 *            The pattern
	 */
	public PatternMatching(SplitModel m2, PredOrUnionExpr cd,
			PredOrUnionExpr ped) {
		this.le = null;
		this.binding = null;
		this.matched = false;
		this.m = m2;

		matching(cd, ped);

	}

	private void matching(Expr cd, Expr pattern) {
		matched = true;
		if (!cd.equals(pattern))
			if (pattern instanceof ID) {
				ID idp = (ID) pattern;
				DataConsData dcons = m.getDataByConsName(pattern.print());
				if (dcons != null) {
					// the pattern is a constructor with arity 0...but we know
					// already that it is different from the call args.
					matched = false;
				} else {
					// a new variable!
					// this generates a binding
					if (binding == null)
						binding = new Substitution();
					binding.put(idp.print(), cd);
				}
			} else if (cd instanceof PredOrUnionExpr
					&& pattern instanceof PredOrUnionExpr) {
				PredOrUnionExpr e = (PredOrUnionExpr) cd;
				PredOrUnionExpr pe = (PredOrUnionExpr) pattern;
				ID idi = e.getId();
				ID idp = pe.getId();
				// this should not happen...
				if (idi == null || idp == null) {
					matched = false;
				} else if (!idi.equals(idp)) {
					matched = false;

				} else {// the root match. Check the arguments
					List<Expr> li = e.getArgs();
					List<Expr> lp = pe.getArgs();
					int ni = li == null ? 0 : li.size();
					int n = lp == null ? 0 : lp.size();
					if (ni != n) {// this shouldn't happen
						matched = false;
						Parsing.error("Different number of arguments in case call expression and branch pattern "
								+ e.print() + " " + pe.print());
					} else
						for (int i = 0; i < n && matched; i++)
							matching(li.get(i), lp.get(i));
				}
			} else {
				// different expresions which are not PredOrUnionExpr
				matched = false;
			}

	}

	/**
	 * Matching of the variable v declared of type d with level l and the
	 * expression expr
	 * 
	 * @param d
	 * @param v
	 * @param l
	 * @param expr
	 */
	private void matching(DataDef d, ID v, int l, Expr expr) {
		// changed to false if the matching is not possible
		matched = true;

		// matching a compound term implies having a level greater than 0
		if (expr instanceof PredOrUnionExpr && l > 0) {
			PredOrUnionExpr ped = (PredOrUnionExpr) expr;
			String root = ped.getId().print();
			DataConsData dcons = d.getDataByConsName(root);
			int nargs = ped.getArgs() != null ? ped.getArgs().size() : 0;
			int patternarity = dcons.getCons().getSubtypes() != null ? dcons
					.getCons().getSubtypes().size() : 0;
			if (dcons != null && nargs == patternarity) {
				// the variable needs to take the value of the position
				if (le == null)
					le = new ArrayList<Equal>();
				Equal eq = new Equal(v, new IntC(dcons.getPosition()));
				le.add(eq);
				// now the recursive calls
				int consPos = dcons.getPosition();
				for (int j = 0; matched && j < nargs; j++) {
					ID id2 = new ID(TransVar.newVarName(v.print(), consPos,
							j + 1));
					matching(d, id2, l - 1, ped.getArgs().get(j));
				}
			} else
				matched = false;
		} else if (expr instanceof ID) {
			// a constant or a variable
			ID id = (ID) expr;
			String root = id.print();
			DataConsData dcons = d.getDataByConsName(root);
			if (dcons != null) {
				// a constructor with arity 0
				Equal eq = new Equal(v, expr);
				le.add(eq);
			} else {
				// a new variable!
				// this generates a binding
				if (binding == null)
					binding = new Substitution();
				binding.put(root, v);

			}
		} else if (expr instanceof IntC || expr instanceof BoolC
				|| expr instanceof FloatC || expr instanceof StringC) {
			Equal eq = new Equal(v, expr);
			le.add(eq);
		} else
			// the matching is impossible because the patter is non-valid
			matched = false;

	}

	/**
	 * @return The expression False if the matching was unsuccessful and the
	 *         conjunction of the the equalities defining the matching
	 *         otherwise.
	 */
	public Expr getMatchingExpression() {
		Expr r = null;
		if (!matched)
			r = new BoolC(false);
		else if (le != null)
			r = new And(le);
		else
			r = new BoolC(true);
		return r;
	}

	public boolean fail() {
		return matched == false;
	}

	public Substitution getSubstitution() {
		return binding;
	}

	@Override
	public String toString() {
		String s = "";
		if (le != null)
			s += "Equalities: " + le;
		if (binding != null)
			s += " Binding: " + binding;
		return s;
	}
}
