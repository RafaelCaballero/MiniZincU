/**
 * 
 */
package minizinc.representation;

import java.util.ArrayList;
import java.util.List;

import minizinc.representation.expressions.Expr;
import transformation.ExprTransformer;

/**
 * The classes that implement this interface apply a transformer to all their
 * first level.
 * 
 * @author rafa
 *
 */
public interface SubExpressions {
	/**
	 * Applies a transformer to all the subexpressions, substituting the
	 * subexpressions by the new subexpressions provided by the transformer
	 * 
	 * @return
	 */
	public void subexpressions(ExprTransformer t);

	/**
	 * Applies the transformer to an expression.
	 * 
	 * @param t
	 *            The transformer.
	 * @param e
	 *            Any expression.
	 * @return t.transform(e.subexpressions(t)) if e!=null. Otherwise null;
	 */
	public default Expr applyTransformer(ExprTransformer t, Expr e) {
		Expr r = null;
		if (e != null) {
			e.subexpressions(t);
			r = (Expr) t.transform(e);
			if (r == null)
				r = e;
		}
		return r;
	}

	/**
	 * Applies the transformer to the subexpressions of the input.
	 * 
	 * @param t
	 *            The transformer.
	 * @param e
	 *            Any object implementing the interface {@link SubExpressions}
	 * @return e.subexpressions(t) if e!=null. Otherwise null;
	 */

	public default <T extends SubExpressions> T applyTransformer2(
			ExprTransformer t, T e) {
		T r = null;
		if (e != null) {
			e.subexpressions(t);
			r = e;
		}
		return r;
	}

	/**
	 * Apply the transformations to all the elements in the list.
	 * 
	 * @param t
	 *            The transformer.
	 * @param e
	 *            Input list of expressions.
	 * @return null if no element of e has been transformed. Otherwise, a list
	 *         with the same length as e. At the i-th position the list contains
	 *         <ul>
	 *         <li> {@code e.get(i)} if {@code t.transform(e.get(i))==null }
	 *         <li> {@code t.transform(e.get(i)) } if
	 *         {@code t.transform(e.get(i))!==null }
	 *         </ul>
	 */
	public default List<Expr> applyTransformerList(ExprTransformer t,
			List<Expr> e) {
		List<Expr> r = new ArrayList<Expr>();
		if (e != null && e.size() > 0) {
			for (int i = 0; i < e.size(); i++) {
				Expr exp = e.get(i);
				Expr expp = applyTransformer(t, exp);
				r.add(expp);
			}
		}
		return r;
	}

	/**
	 * Apply the transformations to all the subexpressions of elements in the
	 * list.
	 * 
	 * @param t
	 *            The transformer.
	 * @param e
	 *            Input list of expressions.
	 * @return A list with the same length as e. At the i-th position the list
	 *         contains the result of applying the transformation to all the
	 *         subexpressions of the element. The different with
	 *         {@link applyTransformerList} is that here the transformation is
	 *         not applied to the elements of the list themselves, which do not
	 *         need to be expressions.
	 */
	public default <T extends SubExpressions> List<T> applyTransformerList2(
			ExprTransformer t, List<T> e) {
		List<T> r = new ArrayList<T>();
		if (e != null && e.size() > 0) {
			for (int i = 0; i < e.size(); i++) {
				T exp = e.get(i);
				T expp = applyTransformer2(t, exp);
				// copy the new transformed element
				r.add(expp);
			}
		}
		return r;
	}

}
