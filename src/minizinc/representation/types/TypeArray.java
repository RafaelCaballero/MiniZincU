package minizinc.representation.types;

import java.util.List;
import java.util.stream.Collectors;

import minizinc.representation.TypeName;

/**
 * A type array is defined by:
 * <ol>
 * <li> The array dimensions
 * <li> The array elements type
 * </ol>
 * @author rafa
 *
 */
public class TypeArray extends Type {
	private List<Type> dimensions;
	private Type base; 
	
	/**
	 * Constructor for arrays
	 * @param dimensions Dimensions defining the array
	 * @param base base type
	 */
	public TypeArray(List<Type> dimensions, Type base) {
		this.dimensions = dimensions;
		this.base = base;
	}

	/**
	 * This is used because the type cannot be written complete since we don't 
	 * know if the type base is a var or not. That is, with the info in this class it could
	 * be:
	 * <ol>
	 * <li> {@code array [dim1...dimn] of base}, or
	 * <li> {@code array [dim1...dimn] of var base} 
	 * </ol> 
	 * This method returns the first part, until {@code of} 
	 * 
	 * @return The first part of the type of the form:
	 * {@code array [dim1...dimn] of} 
	 */
	public String printDimensions(){
		String s = "array ["; 
		List<String> dims = dimensions.stream().map(x -> x.print()).collect(Collectors.toList());
		s += String.join(",", dims);
		s+= "] of ";
		return s;
		
	}
	/**
	 * This is used because the type cannot be written complete since we don't 
	 * know if the type base is a var or not. That is, with the info in this class it could
	 * be:
	 * <ol>
	 * <li> {@code array [dim1...dimn] of base}, or
	 * <li> {@code array [dim1...dimn] of var base} 
	 * </ol> 
	 * This method returns the first part, until {@code of} 
	 * 
	 * @return The second part of the type, the representation of 
	 * {@code base} 
	 */
	public String printBase(){
		return base.print();
		
	}

	/**
	 * In this type {@code print} is not really useful.
	 * see {@link   printBase} and {@link   printDimensions} 
	 */
	@Override
	public String print() {
		// TODO Auto-generated method stub
		return printDimensions()+printBase();
	}

	@Override
	public TypeName type() {
		return TypeName.ARRAY;
	}

}
