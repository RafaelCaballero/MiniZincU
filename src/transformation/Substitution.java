/**
 * 
 */
package transformation;

import java.util.HashMap;
import java.util.List;

import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.statement.Decl;

/**
 * Represents a substitution of MiniZinc variables by values. Used mainly for
 * unfolding predicates and functions.
 * 
 * @author rafa
 *
 *
 */
public class Substitution implements ExprTransformer {

	/**
	 * The substitution is represented by a binding.
	 */
	protected HashMap<String, Expr> binding;

	/**
	 * Creates a constructor that initializes the binding associated to the
	 * substitution.
	 * 
	 * @param decls
	 * @param largs
	 */
	public Substitution(List<Decl> decls, List<Expr> largs) {
		String name; // the name of the variable in decl
		Decl decl; // the parameter declaration
		Expr expr; // the expression to bind the parameter

		// build the bind, one by one
		for (int i = 0; i < decls.size(); i++) {
			decl = decls.get(i);
			expr = largs.get(i);
			name = decl.getID().print();
			put(name, expr);

		}

	}

	/**
	 * Constructor representing the identity substitution
	 */
	public Substitution() {
		this.binding = null;
	}

	/**
	 * A new binding (name, expr).
	 * 
	 * @param name
	 *            String with the variable name.
	 * @param expr
	 *            Value
	 */
	public void put(String name, Expr expr) {
		if (binding == null)
			binding = new HashMap<String, Expr>();
		binding.put(name, expr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * transformation.ExprTransformer#transform(minizinc.representation.expressions
	 * .Expr)
	 */
	/**
	 * Transforms variable into its value according to this substitution.
	 */
	@Override
	public Expr transform(Expr input) {
		Expr r = null;
		if (binding != null && input != null && input instanceof ID) {
			ID id = ((ID) input);
			r = binding.get(id.print());
		}
		return r;
	}

	@Override
	public String toString() {
		String r = "" + binding;
		return r;
	}

}
