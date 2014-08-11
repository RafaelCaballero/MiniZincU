package minizinc.representation.statement;

import java.util.ArrayList;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.DataContext;
import minizinc.representation.Parsing;
import minizinc.representation.DataDef.DataCons;
import minizinc.representation.expressions.Expr;
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

	@Override
	public List<Expr> subexpressions() {
		// no subexpression in a data definition
		return null;
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

}
