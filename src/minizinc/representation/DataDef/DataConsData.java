/**
 * 
 */
package minizinc.representation.DataDef;

import minizinc.representation.statement.DataDef;

/**
 * Data for a constructor in a an union type. It includes the data definition, the data of the constructor and the position
 * of the constructor in the user union definition (in textual order) 
 * @author rafa
 *
 */
public class DataConsData{
	protected DataDef def;
	protected DataCons cons;
	protected int position;
	/**
	 * Constructs a DataConsData value from the data definition, the data defining the constructor and 
	 * the position of the constructor in the user definition.
	 */
	public DataConsData(DataDef def, DataCons cons, int position ) {
		this.def = def;
		this.cons = cons;
		this.position = position;
	}
	/**
	 * @return the def
	 */
	public DataDef getDef() {
		return def;
	}
	/**
	 * @return the cons
	 */
	public DataCons getCons() {
		return cons;
	}
	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	public boolean equals(DataConsData dd) {
		boolean r= dd.getDef().getDataName().equals(def.getDataName()) && dd.getPosition()==position;
			
		return r;
	}
	
	@Override
	public String toString() {
		return "Datadef: "+def+" . Cons: " + cons + ". Pos: "+position; 
	}

}
