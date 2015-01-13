package transformation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.LetDecl;
import minizinc.representation.expressions.LetExpr;
import minizinc.representation.statement.Decl;

/**
 * Collects the names all the let variables that occur in an expression
 * 
 * @author rafa
 *
 */
public class LetVarGetter implements ExprTransformer {
	private Set<String> ids;

	public LetVarGetter() {
		ids = new HashSet<String>();
	}

	@Override
	public Expr transform(Expr input) {

		if (input != null && input instanceof LetExpr) {
			LetExpr le = (LetExpr) input;
			List<LetDecl> ll = le.getDecl();
			if (ll != null) {
				Set<Decl> ld = ll.stream()
						.filter(x -> x.getStatement() instanceof Decl)
						.map(x -> (Decl) x.getStatement())
						.collect(Collectors.toSet());
				ids.addAll(ld.stream().map(x -> x.getID().print())
						.collect(Collectors.toSet()));
			}

		}

		// return the same input because this is not really a transformer but a
		// "getter"
		return input;
	}

	public Set<String> getIds() {
		return ids;
	}

}
