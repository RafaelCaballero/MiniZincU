/**
 * 
 */
package minizinc.representation.statement;

import java.util.Arrays;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.InitContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;

/**
 * Represents a MiniZinc initialization, with grammar:
 * init : ID '=' expr; 
 * @author rafa
 *
 */
public class Init extends Statement {
	protected ID id;
	protected  Expr expr;
	/**
	 * @param type
	 */
	public Init(ID id, Expr expr) {
		super(TStatement.INIT);
		this.id = id;
		this.expr = expr;
		
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return id.print()+"="+expr.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		return Arrays.asList(expr);
	}

	public static Init init(InitContext ctx) {
		Init r = null;
		if (Parsing.hasTerminal(ctx.ID()) && Parsing.has(ctx.expr())) {
			ID id = ID.IDTerm(ctx.ID());
			Expr expr = Expr.expr(ctx.expr());
			r = new Init(id,expr);
		} else
			Parsing.error("Init "+ctx.getText());
		return r;
	}

}
