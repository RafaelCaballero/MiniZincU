/**
 * 
 */
package minizinc.representation.expressions.cases;

import java.util.Arrays;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.CaseBranchContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;
import minizinc.representation.SubExpressions;
import minizinc.representation.TypeName;
import minizinc.representation.Typeable;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.PredOrUnionExpr;

/**
 * A case expression branch. With grammar
 * caseBranch : predOrUnionExpr '-->' expr;  
 * @author rafa
 *
 */
public class Branch implements SubExpressions, MiniZincRepresentation, Typeable {
	protected PredOrUnionExpr pattern;
	protected Expr expr;
	/**
	 * 
	 */
	public Branch(PredOrUnionExpr pattern, Expr expr) {
		this.expr = expr;
		this.pattern = pattern;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return pattern.print()+"-->" + expr.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		return Arrays.asList(pattern,expr);
	}

	@Override
	public TypeName type() {
		return expr.type();
	}

	public PredOrUnionExpr getPattern() {
		return pattern;
	}

	public Expr getExpr() {
		return expr;
	}

	public static Branch branch(CaseBranchContext ctx) {
		Branch r = null;
		if (Parsing.has(ctx.predOrUnionExpr()) && Parsing.has(ctx.expr()) ) {
			PredOrUnionExpr p = PredOrUnionExpr.predOrUnionExpr(ctx.predOrUnionExpr());
			Expr expr = Expr.expr(ctx.expr());
			r = new Branch(p,expr);
		} else
			Parsing.error("Branch "+ctx.getText());
		return r;
	}

}
