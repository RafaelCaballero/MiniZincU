package minizinc.representation.expressions;

import java.util.List;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.ArrayaccessContext;
import minizinc.representation.Parsing;

public abstract class ArrayAccess extends Expr {
	/**
	 * At least a list with one or more expressions acting as indexes
	 */
	protected List<Expr> indexes;

	public ArrayAccess(List<Expr> indexes) {
		this.indexes = indexes;
	}

	public List<Expr> getIndexes() {
		return indexes;
	}

	@Override
	public String print() {
		return print(indexes);
	}

	protected String print(List<Expr> indexes) {
		String s1 = printList(indexes);
		return "[" + s1 + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.expressions.Expr#subexpressions()
	 */
	@Override
	public void subexpressions(ExprTransformer t) {
		List<Expr> l = applyTransformerList(t, indexes);
		if (l != null)
			indexes = l;
	}

	/**
	 * Array access. Grammar: <br>
	 * arrayaccess : ID simpleNonEmptyList | simpleNonEmptyList
	 * simpleNonEmptyList;
	 * 
	 * @param ctx
	 *            the context
	 * @return Java representation of the array access
	 */
	public static ArrayAccess arrayaccess(ArrayaccessContext ctx) {
		ArrayAccess t = null;
		if (Parsing.hasTerminal(ctx.ID())
				&& ctx.simpleNonEmptyList().size() == 1) {
			ID id = ID.IDTerm(ctx.ID());
			t = IdArrayAccess.idarrayaccess(id, ctx.simpleNonEmptyList(0));

		} else if (ctx.simpleNonEmptyList().size() == 2) {
			t = ArrayArrayAccess.arrayarrayaccess(ctx.simpleNonEmptyList(0),
					ctx.simpleNonEmptyList(1));
		} else
			Parsing.error("arrayaccess " + ctx.getText());

		return t;
	}

	@Override
	public abstract ArrayAccess clone();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((indexes == null) ? 0 : indexes.hashCode());
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
		ArrayAccess other = (ArrayAccess) obj;
		if (indexes == null) {
			if (other.indexes != null)
				return false;
		} else if (!indexes.equals(other.indexes))
			return false;
		return true;
	}

}
