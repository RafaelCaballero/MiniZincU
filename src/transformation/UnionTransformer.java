/**
 * 
 */
package transformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import minizinc.representation.Parsing;
import minizinc.representation.expressions.CaseExpr;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.PredOrUnionExpr;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.Decl;
import minizinc.representation.statement.Function;
import minizinc.representation.statement.Predicate;
import minizinc.representation.statement.Procedure;

/**
 * Eliminates predicate and function calls related to union types.
 * 
 * @author rafa
 *
 */
public class UnionTransformer implements ExprTransformer {
	/**
	 * Reference model. Used for consulting information (for instance data
	 * declarations)
	 */
	protected SplitModel m;
	protected Set<String> recpred;
	protected Set<String> recfunc;

	/**
	 * @param m
	 * @param recpred
	 * @param recfunc
	 */
	public UnionTransformer(SplitModel m, Set<String> recpred,
			Set<String> recfunc) {
		this.m = m;
		this.recpred = recpred;
		// this.unionpred = unionpred;
		this.recfunc = recfunc;

	}

	/**
	 * @return If the expression is an application of a function or predicate
	 *         with unions it returns the body of the predicate with the
	 *         arguments substituted by the call values. The body of the
	 *         predicate is cloned, so it can be used again.
	 * 
	 */
	public Expr transform(Expr input) {
		Expr r = null;

		// applications occur as PredOrUnion objects
		if (input != null && input instanceof PredOrUnionExpr) {
			boolean isRecPred = false; // becomes true if the expression is the
										// call to a predicate with union args.
			boolean isRecFunc = false; // becomes true if the expression is the
										// call to a function with union args.
			PredOrUnionExpr apply = (PredOrUnionExpr) input;
			String name = apply.getId().print();
			// if there are union predicates look for it
			if (recpred != null) {
				if (recpred.contains(name))
					isRecPred = true;
			}
			// can it be a call to a function with a union argument?
			if (!isRecPred && recfunc != null) {
				if (recfunc.contains(name))
					isRecFunc = true;
			}

			if (isRecPred || isRecFunc) {
				// input parameters of the predicate
				List<Decl> ldecl;

				Procedure p;
				if (isRecPred)
					// get the predicate definition
					p = m.getPredicateByName(name);
				else
					// get the function definition
					p = m.getFunctionByName(name);

				// we work with a copy of the body...yes, I am afraid I am
				// using clone
				r = p.getBody().clone();
				ldecl = p.getDecls();
				int nargs = ldecl.size();

				List<Expr> largs = apply.getArgs();
				if (largs.size() != nargs)
					Parsing.error(" number of arguments in call does not match predicate definition ("
							+ input.print() + ")");
				else {
					// create the substitution
					Substitution s = new Substitution(ldecl, largs);
					// apply the substitution
					r.subexpressions(s);

					// if r is a CaseExpr now we need to replace the local
					// variable to avoid infinity recursive calls
					if (r instanceof CaseExpr) {
						CaseTransformer ct = new CaseTransformer(m,
								(CaseExpr) r);
						r = ct.transform();
					}

					// now eliminate the calls in the predicate definition
					r.subexpressions(this);
					
					
				}
			}
		}
		return r;
	}

}
