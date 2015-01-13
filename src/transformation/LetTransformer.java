package transformation;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.LetDecl;
import minizinc.representation.expressions.LetExpr;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.Decl;

/**
 * Transforms any expression replacing the let declarations by new fresh
 * variables that do not overlap neither the params & var declared in the model
 * nor the local vars introduced in an expression passed to the constructor
 * 
 * @author rafa
 *
 */
public class LetTransformer implements ExprTransformer {
	/**
	 * List of existing identifiers. Let variables must be substituted by new
	 * names not in this list. The list contains the name of all the var&par
	 * declared in the model plus the let var declared in the expression
	 */
	Set<String> ids;

	/**
	 * Constructs a let transformer including all the variables in {@link m}
	 * plus the let vars in {@link input}
	 * 
	 * @param m
	 *            The model
	 * @param input
	 *            An expression
	 */
	public LetTransformer(SplitModel m, Expr input) {

		ids = m.getDecl().stream().map(x -> x.getID().print())
				.collect(Collectors.toSet());
		LetVarGetter lv = new LetVarGetter();
		input.subexpressions(lv);
		Set<String> varsinput = lv.getIds();
		ids.addAll(varsinput);

	}

	/**
	 * The let vars in the expression are added to the set of variables that
	 * cannot be repeated
	 * 
	 * @param input
	 */
	public void addLetVars(Expr input) {
		LetVarGetter lv = new LetVarGetter();
		input.subexpressions(lv);
		Set<String> varsinput = lv.getIds();
		ids.addAll(varsinput);

	}

	@Override
	public Expr transform(Expr input) {
		Expr r = input;
		if (input != null && input instanceof LetExpr) {
			LetExpr le = (LetExpr) input;
			// get the identifiers of the let declarations
			Set<String> ll = le.getDecl().stream()
					.filter(x -> x.getStatement() instanceof Decl)
					.map(x -> ((Decl) x.getStatement()).getID().print())
					.collect(Collectors.toSet());
			// intersection with ids
			ll.retainAll(ids);
			// non-empty intersection
			if (ll != null && ll.size() > 0) {
				Substitution s = new Substitution();
				for (String idname : ll) {
					// create new name
					String idname2;
					int i = 1;
					do {
						i++;
						idname2 = idname + "_" + i;
					} while (ids.contains(idname2));
					// add it to the substitution
					s.put(idname, new ID(idname2));
				}

				// apply the substitution
				r = input.clone();
				r.subexpressions(s);

			}

		}

		return r;
	}

	@Override
	public String toString() {
		return ids + "";
	}

}
