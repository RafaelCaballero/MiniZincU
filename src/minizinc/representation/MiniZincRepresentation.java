package minizinc.representation;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */

/**
 * Classes implementing this interface ensure that they return a String
 * representation which is valid for MiniZinc
 * 
 * @author rafa
 *
 */
public interface MiniZincRepresentation {

	/**
	 * @return A string representation in a valid format for MiniZinc compiler
	 */
	public String print();

	/**
	 * @return A string representation in a valid format for MiniZinc compiler
	 *         preceded by n blank spaces
	 */
	public default String print(int n) {
		return nSpc(n) + print();
	}

	public default String nSpc(int n) {
		return new String(new char[n]).replace("\0", " ");
	}

	/**
	 * Return a string as the join of printing elements in a list
	 * 
	 * @param lt
	 * @return
	 */
	public default String printList(List<? extends MiniZincRepresentation> lt) {
		return printList(",", lt);
	}

	/**
	 * Return a string as the join of printing elements in a list
	 * 
	 * @param lt
	 * @return
	 */
	public default String printList(String sep,
			List<? extends MiniZincRepresentation> lt) {
		String s = "";
		List<String> l = lt.stream().map(x -> x.print())
				.collect(Collectors.toList());
		if (l != null && l.size() > 1)
			s = String.join(sep, l);
		else if (l != null && l.size() == 1)
			s = l.get(0);
		return s;
	}

}
