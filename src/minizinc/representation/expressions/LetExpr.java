/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		List<String> ls = decls.stream().map(x -> x.print()).collect(Collectors.toList());
		// now join them
		String declsAsS = String.join(",", ls);

		String s = "let {"+declsAsS+"}"+ expr + " in" + expr.print();
		return s;
	}

	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		List<Expr > lnew = new ArrayList<Expr>();
		decls.forEach(x -> x.subexpressions().forEach(y ->  lnew.add(y)));                                  
		lnew.add(expr);		
		return lnew;		
	}

	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#type()
	 */
	@Override
	public TypeName type() {
		// the type of the expression
		return expr.type();
	}

}
