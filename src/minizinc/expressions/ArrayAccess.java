package minizinc.expressions;

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
		// first apply print to all the expressions
		List<String> ls = indexes.stream().map(x -> x.print()).collect(Collectors.toList());
		// now join them
		String s = String.join(",", ls);
		return "["+s+"]";
	}

	/* (non-Javadoc)
	 * @see minizinc.expressions.Expr#subexpressions()
	 */
	@Override
	public List<? extends Expr> subexpressions() {
		return indexes;
	}


}
