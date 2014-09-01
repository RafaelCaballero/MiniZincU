/**
 * 
 */
package minizinc.representation.DataDef;

import minizinc.representation.statement.DataDef;

/**
 * @author rafa
 *
 */
public class DataConsData{
	protected DataDef def;
	protected DataCons cons;
	protected int position;
	/**
	 * 
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
