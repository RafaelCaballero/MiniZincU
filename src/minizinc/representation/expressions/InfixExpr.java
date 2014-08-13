/**
 * 
 */
package minizinc.representation.expressions;

import java.util.Arrays;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.InfixOpContext;
import minizinc.representation.TypeName;

/**
 * An infix expression with Grammar:
 *    expr infixOp expr
 *
 * @author rafa
 *
 */
public class InfixExpr extends Expr {
	protected Expr e1;
	protected Expr e2;
	protected InfixOp op;
	/**
	 * constructor 
	 */
	public InfixExpr(InfixOp op, Expr e1, Expr e2) {
		this.e1 = e1;
		this.e2 = e2;
		this.op = op;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		// TODO Auto-generated method stub
		return e1.print()+ " "+op.print() + " "+ e2.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		return Arrays.asList(e1,e2);
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		// TODO at the moment I assume the type is the type of the first operand...
		// which many times is wrong
		return e1.type();
	}

	public static InfixExpr infixExpr(Expr t0, Expr t1, InfixOpContext ctx) {
		InfixExpr r = null;
		InfixOp infixop = InfixOp.infixop(ctx);
		r = new InfixExpr(infixop,t0,t1);
		
		return r;
	}

}
