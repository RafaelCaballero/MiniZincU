/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.ArithExprContext;
import minizinc.antlr4.MiniZincGrammarParser.MinusExprContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;

/**
 * Grammar:
 * minusExpr      :  '-'  arithExpr ;
 *
 * @author rafa
 *
 */
public class MinusArithExpr extends ArithExpr {
	private Expr expr;
	/**
	 * Constructor
	 */
	public MinusArithExpr(Expr expr) {
		this.expr = expr;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "-" + expr.print();

	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		List<Expr> l = new ArrayList<Expr>();
		l.add(expr);
		return l;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		return expr.type();
	}
	
	/**
	 * minusExpr : '-' arithExpr ;
	 * 
	 * @param ctx
	 *            Grammar context
	 * @return Term representing the expression
	 */
	public static MinusArithExpr minusExpr(MinusExprContext ctx) {
		MinusArithExpr t = null;
		if (Parsing.has(ctx.arithExpr())) {
			ArithExprContext a = ctx.arithExpr();
			ArithExpr t0 = ArithExpr.arithExpr(a);
			t = new MinusArithExpr(t0);
		} else
			Parsing.error("minusExpr " + ctx.toString());
		return t;
	}





}
