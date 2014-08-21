/**
 * 
 */
package minizinc.representation.expressions.lists;

import java.util.List;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.OneDimListContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;

/**
 * List with one dimension.<br>
 * Grammar: oneDimList :  simpleList | guardedList  ;
 * @author rafa
 *
 */
public  abstract class OneDimList extends ListExpr {
	protected Dimension dim;

	/**
	 * Constructs an empty one dimension list. 
	 */
	public OneDimList() {
		dim = null;
	}

	/**
	 * Constructs a one dimension list. 
	 * @param exprs Elements of the list as a list of Expr values.
	 */
	public OneDimList( List<Expr> exprs) {
		dim = new Dimension(exprs);
	}
	
	/**
	 * Constructs a one dimension list. 
	 * @param exprs Elements of the list as a {@link Dimension} value.
	 */
	public OneDimList( Dimension dim) {
		this.dim = dim;
	}
	
	protected String printElements() {
		String s = "";
		if (dim!=null)
			s+= dim.print();
		return s;
	}
	
	public boolean isEmptyList(){
		return dim == null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Grammar:<br>
	 * oneDimList : simpleList | guardedList ;
	 * 
	 * @param oneDimList
	 *            the context
	 * @return Term representation of a one dimension list
	 * 
	 */
	public static OneDimList oneDimList(OneDimListContext oneDimList) {
		OneDimList t = null; // output value
		if (Parsing.has(oneDimList.simpleList())) {
			t = SimpleList.simpleList(oneDimList.simpleList());

		} else if (Parsing.has(oneDimList.guardedList())) {
			t = GuardedList.guardedList(oneDimList.guardedList());
		}
		return t;
	}
	
	@Override
	public abstract OneDimList clone();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dim == null) ? 0 : dim.hashCode());
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
		OneDimList other = (OneDimList) obj;
		if (dim == null) {
			if (other.dim != null)
				return false;
		} else if (!dim.equals(other.dim))
			return false;
		return true;
	}
	
	@Override
	public void subexpressions(ExprTransformer t) {
		Dimension dim2 = this.applyTransformer2(t, dim);
		dim = dim2;
		
	}


}
