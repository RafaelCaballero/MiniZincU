/**
 * 
 */
package minizinc.representation.expressions.lists;

import java.util.Arrays;
import java.util.List;

import minizinc.representation.TypeName;
import minizinc.representation.expressions.Expr;

/**
 * A list expression of the form e1 op e2, with e1 and e2 lists expressions and op 
 * an operator like "++"
 * @author rafa
 *
 */
public class InfixListExpr extends ListExpr {
	private ListExpr e1;
	private ListExpr e2;
	private String op;

	public InfixListExpr(String op, ListExpr t0, ListExpr t1) {
		this.e1 = t0;
		this.e2 = t1;
		this.op = op;
	}

	/* (non-Javadoc)
	 * @see minizinc.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return e1.print() + " "+op+" "+e2.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		return Arrays.asList(e1,e2);
	}

	@Override
	public TypeName type() {
		// this can be complex in the type of expressions
		// At the moment just a naive (possibly incorrect) version: the type of an operator
		return e1.type();
	}

}
