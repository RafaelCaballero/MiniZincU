/**
 * 
 */
package minizinc.representation.expressions;

import java.util.Arrays;
import java.util.List;

import minizinc.representation.TypeName;

/**
 * A bool expression of the form e1 op e2, with e1 and e2 arithmetic expressions and op 
 * a relational operator (<,<=...).
 * @author rafa
 *
 */
public class InfixArithExpr extends ArithExpr {
	private Expr e1;
	private Expr e2;
	private String op;

	public InfixArithExpr(String op, Expr t0, Expr t1) {
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
	
	public static InfixArithExpr infixArithExpr(ArithExpr t0, ArithExpr t1,
			String op) {
		return new InfixArithExpr(op,t0,t1);
	}



}
