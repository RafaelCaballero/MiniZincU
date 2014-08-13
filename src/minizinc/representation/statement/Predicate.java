/**
 * 
 */
package minizinc.representation.statement;

import java.util.ArrayList;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.PredicateContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;

/**
 * Represents a predicate definition. Grammar:<br>
 * predicate : 'predicate' ID'(' (decl(','decl)*)? ')' '=' expr;
 * @author rafa
 *
 */
public class Predicate extends Statement {
	protected ID id;
	protected List<Decl> decls;
	protected Expr expr;
	
	/**
	 * @param type
	 */
	public Predicate(ID id, List<Decl> decls, Expr expr) {
		super(TStatement.PREDICATE);
		this.id = id;
		this.decls = decls;
		this.expr = expr;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "predicate "+id.print()+"("+printList(decls)+")" + "=\n" + expr.print();
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

	public static Predicate predicate(PredicateContext ctx) {
		Predicate r = null;
		List<Decl> decls = new ArrayList<Decl>();
		// just to check if the grammar has changed
		if (Parsing.hasTerminal(ctx.ID()) && Parsing.has(ctx.expr())) {
			ID id = ID.IDTerm(ctx.ID());
			Expr expr = Expr.expr(ctx.expr());
			// now the list of local declarations
			ctx.decl().stream().allMatch(x->decls.add(Decl.decl(x)));
			r = new Predicate(id,decls,expr);
		} else
			Parsing.error("predicate : "+ctx.getText());
		return r;
	}

}
