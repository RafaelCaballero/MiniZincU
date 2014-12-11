/**
 * 
 */
package minizinc.representation.expressions;

import java.util.ArrayList;
import java.util.List;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.SimpleNonEmptyListContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.lists.Dimension;

/**
 * ArrayAccess of the form id[e1...en]
 * 
 * @author rafa
 *
 */
public class IdArrayAccess extends ArrayAccess {
	private ID id;

	public IdArrayAccess(ID id, List<Expr> indexes) {
		super(indexes);
		this.id = id;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.MiniZincRepresentation#print()
	 */
	@Override
	public String print() {
		String s = id.print() + super.print();
		return s;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.expressions.Expr#type()
	 */
	@Override
	public TypeName type() {
		// TODO it should be the type of the elements of the array referenced by
		// ID
		return null;
	}

	/**
	 * Array access of the form id[e1...en]
	 * 
	 * @param id
	 *            The identifier, already in Java format
	 * @param ctx
	 *            list of indexes
	 * @return The Java representation
	 */
	public static IdArrayAccess idarrayaccess(ID id,
			SimpleNonEmptyListContext ctx) {
		IdArrayAccess t = null;
		int n = ctx.nonEmptyListElems().expr().size();
		if (n != 0) {
			Dimension indexes = Dimension.dimension(ctx.nonEmptyListElems());
			t = new IdArrayAccess(id, indexes.getExprs());
		} else
			Parsing.error("IdArrayAccess (Id: " + id + ") with 0 indexes "
					+ ctx.getText());
		return t;
	}

	@Override
	public IdArrayAccess clone() {
		IdArrayAccess r = null;
		ID idp = id == null ? null : id.clone();
		List<Expr> indexesp = null;
		if (indexes != null) {
			indexesp = new ArrayList<Expr>();
			for (Expr e : indexes)
				indexesp.add(e.clone());
		}
		r = new IdArrayAccess(idp, indexesp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdArrayAccess other = (IdArrayAccess) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see minizinc.expressions.Expr#subexpressions()
	 */
	@Override
	public void subexpressions(ExprTransformer t) {
		super.subexpressions(t);
		ID id2 = this.applyTransformer2(t, id);
		id = id2;
	}

}
