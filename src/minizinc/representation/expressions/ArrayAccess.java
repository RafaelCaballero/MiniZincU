package minizinc.representation.expressions;

import java.util.List;
import java.util.stream.Collectors;

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
		return "["+s1+"]";
	}

	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#subexpressions()
	 */
	@Override
	public List<Expr> subexpressions() {
		return indexes;
	}


}
