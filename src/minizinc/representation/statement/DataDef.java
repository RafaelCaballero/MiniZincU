package minizinc.representation.statement;

import java.util.ArrayList;
import java.util.List;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.DataContext;
import minizinc.representation.Parsing;
import minizinc.representation.DataDef.DataCons;
import minizinc.representation.DataDef.DataConsData;
import minizinc.representation.expressions.ID;
import minizinc.representation.types.Type;

/*
 * Representation of a data declaration.<br>
 * Grammar:
 * data: 'enum' ID '=' '{' constr(','constr)* '}';

 */
public class DataDef extends Statement {
	protected ID dataName;
	protected List<DataCons> cons;

	public DataDef(String dataName) {
		super(TStatement.DATA);
		this.dataName =  ID.IDTerm(dataName);
		cons = new ArrayList<DataCons>();
	}

	public DataDef(ID dataName, List<DataCons> cons) {
		super(TStatement.DATA);
		this.dataName =  dataName;
		this.cons =  cons;
	}


	public void add(DataCons c) {
		cons.add(c);
	}

	public DataCons getConsByName(String name) {
		DataCons c = null;
		for (DataCons cp : cons)
			if (cp.getCons().equals(name))
				c = cp;
		return c;
	}

	
	/**
	 * Get the data associated to the constructor.
	 * @param consname Name of the constructor
	 * @return A {@link DataConsData} value, or null if consname is not a constructor of this type.
	 */
	public DataConsData getDataByConsName(String consname) {
		DataConsData r = null;
			int i=1;
			for (DataCons dc:this.getCons()) 
				if (dc.getID().print().equals(consname)) {
					r = new DataConsData(this,dc,i);
				}
				else i++;				   			
		
		return r;
	}

	/** 
	* Adds a new subtype to a constuctor ad returns the position of the constraint
	* *
	*/
	public int addSubtype(String consName, Type t) {
		int r=-1;
		if(cons!=null){
			r = cons.indexOf(new DataCons(consName));

			if (r != -1)
				(cons.get(r)).add(t);
		}
		return r;
	}

	public List<DataCons> getCons() {
		return cons;
	}

	public void setCons(List<DataCons> cons) {
		this.cons = cons;
	}

	public String getDataName() {
		return dataName.print();
	}




	@Override
	public String print() {
		String s = printList(cons);

		return "enum " + dataName.print() + "= {" + s + "}";
	}



	/**
	 * A new sata statement representing an union type.
	 * Grammar:<br>
	 * data: 'enum' ID '=' '{' constr(','constr)* '}';
	 * @param ctx The context.
	 * @return A new DataDef object representing this data definition.
	 */
	public static DataDef data(DataContext ctx) {
		DataDef r = new DataDef(ctx.ID().getText());
		if (Parsing.hasTerminal(ctx.ID())) {
			if (ctx.constr().size()>0) {			
				ctx.constr().forEach(x->r.add(DataCons.tcons(x)));
			} else
				Parsing.error("Data type with 0 constructors! "+ctx.getText());
			
		} else
			Parsing.error("Missing ID in data type definition! "+ctx.getText());
		
		return r;
	}



	@Override
	public DataDef clone() { 
		DataDef r = null;
		
		// protected ID dataName;
		ID idp = dataName == null ? null : dataName.clone();
		
		// protected List<DataCons> cons;
		List<DataCons> consp = null;
		if (cons != null) {
			consp = new ArrayList<DataCons>();
		
			for (DataCons c:consp) 
				consp.add(c.clone());
			
		}
		r = new DataDef(idp,consp);
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cons == null) ? 0 : cons.hashCode());
		result = prime * result
				+ ((dataName == null) ? 0 : dataName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataDef other = (DataDef) obj;
		if (cons == null) {
			if (other.cons != null)
				return false;
		} else if (!cons.equals(other.cons))
			return false;
		if (dataName == null) {
			if (other.dataName != null)
				return false;
		} else if (!dataName.equals(other.dataName))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		ID dataName2 = this.applyTransformer2(t, dataName);
		dataName = dataName2;
		
	}

}
