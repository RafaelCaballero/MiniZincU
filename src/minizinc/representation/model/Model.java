package minizinc.representation.model;



import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.statement.DataDef;
import minizinc.representation.statement.Statement;

public abstract class Model implements MiniZincRepresentation, Cloneable {
	public abstract Model clone();	
	public abstract boolean containsExtensions();
	public abstract boolean containsData();
	
	/**
	 * Adds a new statement to the model.
	 * @param s The statement to be included in the model.
	 */
	public abstract void add(Statement s);
	
	/**
	 * Returns a data definition given its name.
	 * @param typename Name of the data
	 * @return The data definition or null if it is not found
	 */
	public abstract DataDef getDataByName(String typename);

	@Override
	public String toString() {
		return print();
	}

}
