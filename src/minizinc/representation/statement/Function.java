/**
 * 
 */
package minizinc.representation.statement;

import java.util.ArrayList;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.FunctionContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;

/**
 * Represents a predicate definition. Grammar:<br>
 * function : 'function' varmark? qualName '(' (decl(','decl)*)? ')' '=' expr;
 * @author rafa
 *
 */
public class Function extends Statement {
	protected boolean varmark;
	protected boolean extendsmark;
	protected ID id;
	protected String op;
	protected List<Decl> decls;
	protected Expr expr;
	
	/**
	 * Constructs the representation of a MiniZinc function
	 */
	public Function(boolean varmark, boolean extendsmark, ID id, String op,
					List<Decl> decls, Expr expr) {
		super(TStatement.FUNCTION);
		this.extendsmark = extendsmark;
		this.varmark = varmark;
		this.id = id;
		this.op = op;
		this.decls = decls;
		this.expr = expr;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "function "+
	            (varmark ? "var "  : "") +
	            (op!=null ? op + (extendsmark ? " extends " : ":") : "") +
	            id.print()+"("+printList(decls)+")" + "=\n" + expr.print();
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		List<Expr> r = new ArrayList<Expr>();
		decls.forEach(x->x.subexpressions().forEach(y -> r.add(y)));
		r.add(expr);
		return r;
	}
	
	public List<Decl> getDecls() {
		return decls;
	}
	
	public Expr getBody() {
		return expr;
	}
	
	public ID getName() {
		return id;
	}

	public static Statement function(FunctionContext ctx) {
		Function r = null;
		List<Decl> decls = new ArrayList<Decl>();
		// just to check if the grammar has changed
		if (Parsing.has(ctx.qualName()) && Parsing.has(ctx.expr())) {
			ID id = ID.IDTerm(ctx.qualName().ID());
			Expr expr = Expr.expr(ctx.expr());
			boolean extendsmark=false;
			boolean varmark=Parsing.has(ctx.varmark());
			if (Parsing.has(ctx.qualName().op())) {
				String op = ctx.qualName().op().getText();
				extendsmark = Parsing.has(ctx.qualName().extendsmark());
				r = new Function(varmark,extendsmark,id,op,decls,expr);	
			}
		} else
			Parsing.error("function : "+ctx.getText());

		return r;
	}

}
