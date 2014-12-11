/**
 * 
 */
package minizinc.representation.expressions.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.GuardedListContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.InDecl;

/**
 * A one dim, guarded list.<br>
 * Grammar:<br>
 * guardedList : '[' (expr (','expr)*) '|' guard ']' ;
 * 
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String s1 = printElements();
		String s2 = printList(indecls);
		String s = "[" + s1 + " | " + s2 + "]";
		return s;
	}

	/**
	 * A one dim, guarded list.<br>
	 * Grammar:<br>
	 * guardedList : '[' (expr (','expr)*) '|' guard ']' ;
	 * 
	 * @param ctx
	 *            The context.
	 * @return Representation of the guarded list.
	 */
	public static GuardedList guardedList(GuardedListContext ctx) {
		GuardedList r = null;
		if (Parsing.has(ctx.guard())) {
			List<InDecl> indecls = ctx.guard().inDecl().stream()
					.map(x -> InDecl.inDecl(x)).collect(Collectors.toList());
			Dimension d = Dimension.dimension(ctx.nonEmptyListElems());
			r = new GuardedList(d, indecls);
		} else
			Parsing.error("guardedList: " + ctx.toString());

		return r;
	}

	@Override
	public GuardedList clone() {
		GuardedList r = null;
		List<InDecl> indeclsp = null;
		if (indecls != null) {
			indeclsp = new ArrayList<InDecl>();
			for (InDecl i : indecls)
				indeclsp.add(i.clone());
		}
		Dimension dimp = this.dim == null ? null : dim.clone();
		r = new GuardedList(dimp, indeclsp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((indecls == null) ? 0 : indecls.hashCode());
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
		GuardedList other = (GuardedList) obj;
		if (indecls == null) {
			if (other.indecls != null)
				return false;
		} else if (!indecls.equals(other.indecls))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		List<InDecl> indecls2 = this.applyTransformerList2(t, indecls);
		indecls = indecls2;
		super.subexpressions(t);

	}

}
