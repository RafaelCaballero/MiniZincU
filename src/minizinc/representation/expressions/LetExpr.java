/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.LetExprContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;

/**
 * Representation of MiniZinc let expressions.<br>
 * Grammar<br>
 *  letExpr : 'let' '{' letDecl   (',' letDecl)* '}' 'in' expr;
*
 * @author rafa
 *
 */
public class LetExpr extends Expr {
	private List<LetDecl> decls;
	private Expr expr;
	
	/**
	 * @param decls List of local declarations
	 * @param expr expression to evaluate in the context
	 */
	public LetExpr(List<LetDecl> decls, Expr expr) {
		this.decls = decls;
		this.expr = expr;

	}

	/* (non-Javadoc)
	 * @see minizinc.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String declsAsS = printList(decls);
		String s = "let {"+declsAsS+"}"+ " in " + expr.print();
		return s;
	}


	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#type()
	 */
	@Override
	public TypeName type() {
		// the type of the expression
		return expr.type();
	}
	
	/**
	 * Constructing a let expression. Grammar:<br>
	 * letExpr : 'let' '{' letDecl   (',' letDecl)* '}' 'in' expr;
	 * @param ctx the context
	 * @return the representation as a LetExpr
	 */
	public static LetExpr letExpr(LetExprContext ctx) {
		LetExpr t = null;
		if (Parsing.has(ctx.expr())) {
			Expr e = Expr.expr(ctx.expr());
			List<LetDecl> ldecl = ctx.letDecl().stream().map(x -> LetDecl.letDecl(x)).collect(Collectors.toList());
			t = new LetExpr(ldecl,e);
			
		} else {
			Parsing.error("Error in letExpr. No expression found " + ctx.getText());
		}
		return t;
	}

	@Override
	public LetExpr clone() {
		LetExpr r = null;
		List<LetDecl> declsp = null;
		Expr exprp = expr==null ? null : expr.clone();
		if (decls!=null){
			declsp = new ArrayList<LetDecl>();
			for (LetDecl l:decls) 
				declsp.add(l.clone());
		}
		r = new LetExpr(declsp, exprp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((decls == null) ? 0 : decls.hashCode());
		result = prime * result + ((expr == null) ? 0 : expr.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LetExpr other = (LetExpr) obj;
		if (decls == null) {
			if (other.decls != null)
				return false;
		} else if (!decls.equals(other.decls))
			return false;
		if (expr == null) {
			if (other.expr != null)
				return false;
		} else if (!expr.equals(other.expr))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		List<LetDecl> decls2 = this.applyTransformerList2(t, decls);
		Expr expr2 = this.applyTransformer(t, expr);
		
		decls = decls2;
		expr = expr2;
		
	}


}
