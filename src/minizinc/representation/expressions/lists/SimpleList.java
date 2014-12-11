/**
 * 
 */
package minizinc.representation.expressions.lists;

import java.util.List;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.SimpleListContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;

/**
 * Represents a simple, one-dimension list.<br>
 * Grammar: simpleList : '[' ']' | simpleNonEmptyList;
 * 
 * @author rafa
 *
 */
public class SimpleList extends OneDimList {

	/**
	 * Constructor with expressions.
	 * 
	 */
	public SimpleList(List<Expr> elems) {
		super(elems);
	}

	/**
	 * Constructor with the elements as a {@link Dimension} object
	 * 
	 */
	public SimpleList(Dimension d) {
		super(d);
	}

	/**
	 * Empty list
	 */
	public SimpleList() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.representation.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		return "[" + printElements() + "]";
	}

	/**
	 * Grammar: <br>
	 * simpleList : '[' ']' | simpleNonEmptyList; simpleNonEmptyList : '['
	 * expr(','expr)* ']';
	 * 
	 * @param ctx
	 *            the context
	 * @return A term representation of a simple list
	 */
	public static SimpleList simpleList(SimpleListContext ctx) {
		SimpleList r = null;
		if (Parsing.has(ctx.simpleNonEmptyList())) {
			Dimension d = Dimension.dimension(ctx.simpleNonEmptyList()
					.nonEmptyListElems());
			r = new SimpleList(d);
		} else {
			r = new SimpleList();
		}
		return r;
	}

	@Override
	public SimpleList clone() {
		SimpleList r = null;
		Dimension dimp = dim == null ? null : dim.clone();
		r = new SimpleList(dimp);
		return r;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		super.subexpressions(t);

	}

}
