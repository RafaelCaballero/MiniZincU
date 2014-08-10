package minizinc.representation;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */

/**
 * Classes implementing this interface ensure that they return a String representation which 
 * is valid for MiniZinc
 * @author rafa
 *
 */
public interface MiniZincRepresentation {
	
	/**
	 * @return A string representation in a valid format for MiniZinc compiler
	 */
	public String print();
	
	/**
	 * Return a string as the join of printing elements in a list
	 * @param lt
	 * @return
	 */
	public default String printList(List<? extends MiniZincRepresentation> lt) {
		List<String> l = lt.stream().map(x->x.print()).collect(Collectors.toList());
		String s = String.join(",", l);
		return s;
	}

}
