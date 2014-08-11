/**
 * 
 */
package minizinc.representation.expressions.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import minizinc.antlr4.MiniZincGrammarParser.GuardedListContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.InDecl;

/**
 * A one dim, guarded list.<br>
 * Grammar:<br>
 * guardedList : '[' (expr (','expr)*) '|'  guard ']' ;
 * @author Rafa Caballero
 *
 */
public class GuardedList extends OneDimList {
	protected List<InDecl> indecls;

	public GuardedList(List<Expr> exprs, List<InDecl> indecls) {
		super(exprs);
		this.indecls = indecls;
	}
	public GuardedList(Dimension d, List<InDecl> indecls) {
		super(d);
		this.indecls = indecls;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String s1 = printElements();
		String s2 = printList(indecls);
		String s = "[" +s1 + " | " + s2 + "]";
		return s;
	}

	/* (non-Javadoc)
	 * @see minizinc.representation.SubExpressions#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		List<Expr> l  = new ArrayList<Expr>();
		super.subexpressions().forEach(x -> l.add(x));
		indecls.forEach(x -> x.subexpressions().forEach(y -> l.add(y)));
		return l;
	}
	
	/**
	 * A one dim, guarded list.<br>
	 * Grammar:<br>
	 * guardedList : '[' (expr (','expr)*) '|'  guard ']' ;
	 * @param ctx The context.
	 * @return Representation of the guarded list.
	 */
	public static GuardedList guardedList(GuardedListContext ctx) {
		GuardedList r=null;
		if (Parsing.has(ctx.guard()) ) {
			List<InDecl> indecls = ctx.guard().inDecl().stream().
            map(x->InDecl.inDecl(x)).collect(Collectors.toList());
			Dimension d = Dimension.dimension(ctx.nonEmptyListElems());
			r = new GuardedList(d,indecls);
		}  else
			Parsing.error("guardedList: " + ctx.toString());

		return r;
	}



}
