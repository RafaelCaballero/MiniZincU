/**
 * 
 */
package minizinc.representation.model;

import java.util.ArrayList;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.ModelContext;
import minizinc.antlr4.MiniZincGrammarParser.StatContext;
import minizinc.representation.Parsing;
import minizinc.representation.DataDef.DataCons;
import minizinc.representation.DataDef.DataConsData;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.InfixExpr;
import minizinc.representation.expressions.InfixOp;
import minizinc.representation.statement.*;
import minizinc.representation.statement.decls.VarDecl;


/**
 * Represents a model where the different statements are in different attributes
 * @author rafa
 *
 */
public class SplitModel extends Model {
	 protected List<Comment> comment;
	 protected List<DataDef> data;
	 protected List<Constraint> constraint;
	 protected List<Decl> decl;
	 protected List<Extended> extended;
	 protected List<Function> function;
	 protected List<Include> include;
	 protected List<Init> init;
	 protected List<Output> output;
	 protected List<Predicate> predicate;
	 protected List<Solve> solve;
	 
	 /**
	  * complete constructor
	  */
	 public SplitModel(List<DataDef> data, List<Constraint> constraint,
			           List<Decl> decl, List<Extended> extended, 
			           List<Function> function,
			           List<Include> include,
			           List<Init> init,
			           List<Output> output,
			           List<Predicate> predicate,
			           List<Solve> solve ) {
		 this.data = data;
		 this.constraint = constraint;
		 this.decl = decl;
		 this.extended =extended;
		 this.function = function;
		 this.include = include;
		 this.init = init;
		 this.output = output;
		 this.predicate = predicate;
		 this.solve = solve;
		 this.comment = new ArrayList<Comment>();
	 }
			           
	 
	 public SplitModel() {
		data = new ArrayList<DataDef>();
		constraint = new ArrayList<Constraint>();
		decl = new ArrayList<Decl>();
		extended = new ArrayList<Extended>();
		function= new ArrayList<Function>();
		include = new ArrayList<Include>();
		init = new ArrayList<Init>();
		output = new ArrayList<Output>();
		predicate = new ArrayList<Predicate>();
		solve = new ArrayList<Solve>();
		comment = new ArrayList<Comment>();
	 }


	 public void add(Statement s) {
			if (s instanceof DataDef)
				addData((DataDef) s);
			else if (s instanceof Constraint)
				addConstraint((Constraint) s);
			else if (s instanceof Decl)
				addDecl((Decl) s);
			else if (s instanceof Extended)
				addExtended((Extended) s);
			else if (s instanceof Function)
				addFunction((Function) s);
			else if (s instanceof Predicate)
				addPredicate((Predicate) s);
			else if (s instanceof Include)
				addInclude((Include) s);
			else if (s instanceof Init)
				addInit((Init)s);
			else if (s instanceof Output)
				addOutput((Output) s);
			else if (s instanceof Solve)
				addSolve((Solve)s);
			else if (s instanceof Comment)
				addComment((Comment)s);
			else Parsing.error("Unexpected statatement "+s.print());

	 }
	 private void addComment(Comment s) {
		this.comment.add(s);
		
	}


	public void addData(DataDef data) {
		 this.data.add(data);
	 }
	 
	 public void addConstraint(Constraint cte) {
		 this.constraint.add(cte);
	 }

	 public void addDecl(Decl sta) {
		 this.decl.add(sta);
	 }
	 public void addExtended(Extended sta) {
		 this.extended.add(sta);
	 }
	 public void addFunction(Function sta) {
		 this.function.add(sta);
	 }
	 public void addPredicate(Predicate sta) {
		 this.predicate.add(sta);
	 }
	 public void addInclude(Include sta) {
		 this.include.add(sta);
	 }
	 public void addInit(Init sta) {
		 this.init.add(sta);
	 }
	 public void addOutput(Output sta) {
		 this.output.add(sta);
	 }
	 public void addSolve(Solve sta) {
		 this.solve.add(sta);
	 }

	 public List<DataDef> getData() {
		 return data;
	 }

	@Override
	public String print() {
		String s = "";
		s += new Comment("MiniZinc Model parsed using Antlr4");
		s += new Comment("Rafael Caballero, 2014\n\n\n");

		s += printStatements("",comment);

		s += printStatements("Include Section",include);
		s += printStatements("Extensions Section",extended);
		s += printStatements("Data Section",data);
		s += printStatements("Declarations Section",decl);
		s += printStatements("Init Section",init);
		s += printStatements("Predicates Section",predicate);		
		s += printStatements("Functions Section",function);
		s += printStatements("Constraints Section",constraint);
		s += printStatements("Solve Section",solve);
		s += printStatements("Output Section",output);
		return s;
	}


	public List<Constraint> getConstraint() {
		return constraint;
	}


	public List<Decl> getDecl() {
		return decl;
	}


	public List<Extended> getExtended() {
		return extended;
	}


	public List<Function> getFunction() {
		return function;
	}


	public List<Include> getInclude() {
		return include;
	}


	public List<Init> getInit() {
		return init;
	}


	public List<Output> getOutput() {
		return output;
	}


	public List<Predicate> getPredicate() {
		return predicate;
	}


	public List<Solve> getSolve() {
		return solve;
	}

	
	/**
	 * Parses a model.<br>
	 * Grammar: model: (stat ';')+;
	 * @param ctx parsing context.
	 * @return A {@link BasicModel} object representing the MiniZinc model
	 */
	public static SplitModel model(ModelContext ctx) {
		SplitModel m = new SplitModel();
		// add the statements that form the model
		Statement s=null;
		for (StatContext sta:ctx.stat()) {
			s = Statement.statement(sta);
			m.add(s);
		}

		return m;
	}

	public boolean containsExtensions() {
		boolean r = extended!=null && extended.size()>0;
		return r;
	}
	
	public boolean containsData() {
		boolean r = data!=null && data.size()>0;
		return r;
	}


	@Override
	public SplitModel clone() {
		SplitModel r=null;
		List<DataDef> datap=null;
		List<Constraint> constraintp=null;
        List<Decl> declp=null; 
        List<Extended> extendedp=null; 
        List<Function> functionp=null;
        List<Include> includep=null;
        List<Init> initp=null;
        List<Output> outputp=null;
        List<Predicate> predicatep=null;
        List<Solve> solvep=null;
        
        if (data!=null){
        	datap = new ArrayList<DataDef>();
        	for(DataDef x:data)
        		datap.add(x.clone());
        }
        
        if (constraint!=null){
        	constraintp = new  ArrayList<Constraint>();
        	for (Constraint x: constraint)
        		constraintp.add(x.clone());
        }
        if (decl!=null){
        	declp = new ArrayList<Decl>();
        	for (Decl x:decl)
        		declp.add(x.clone());
        }
        if (extended!=null){
        	extendedp = new ArrayList<Extended>();
        	for (Extended x:extended)
        		extendedp.add(x.clone());
        }
        if (function!=null){
        	functionp = new ArrayList<Function>();
        	for (Function x:function)
        		functionp.add(x.clone());
        }
		if (include!=null){
			includep = new ArrayList<Include>();
			for (Include x:include)
				includep.add(x.clone());
		}
		if (init!=null){
			initp = new ArrayList<Init>();
			for (Init x:init)
				initp.add(x.clone());
		}
		if (output!=null) {
			outputp = new ArrayList<Output>();
			for(Output x:output)
				outputp.add(x.clone());
		}
		if (predicate !=null) {
			predicatep = new ArrayList<Predicate>();
			for(Predicate x:predicate)
				predicatep.add(x.clone());
		}
		if (solve !=null) {
			solvep = new ArrayList<Solve>();
			for(Solve x:solve)
				solvep.add(x.clone());
		}
        r = new SplitModel(datap, constraintp,
                           declp, extendedp,functionp, includep, initp,outputp,
                           predicatep,solvep);
		return r;
	}


	
	/**
	 * Initializations are removed and transformed into equality contrainsts
	 */
	@Deprecated
	public void initsToConstraints() {
		if (init!=null && init.size()>0)
			for (Init x:init) {
				InfixOp op = new InfixOp("=");  
				Expr id = x.getID();
				Expr expr2 = x.getExpr();
				InfixExpr ie = new InfixExpr(op,id,expr2);
				Constraint c = new Constraint(ie);
				constraint.add(0,c);
			}
		
		// all the inits are already constraints. Remove them.
		init.clear();
	}


	@Override
	public DataDef getDataByName(String typename) {
		DataDef r = null;
		if (data!=null)
		for (DataDef d:data) {
			if (d.getDataName().equals(typename))
				r = d;
		}
		return r;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((constraint == null) ? 0 : constraint.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((decl == null) ? 0 : decl.hashCode());
		result = prime * result
				+ ((extended == null) ? 0 : extended.hashCode());
		result = prime * result
				+ ((function == null) ? 0 : function.hashCode());
		result = prime * result + ((include == null) ? 0 : include.hashCode());
		result = prime * result + ((init == null) ? 0 : init.hashCode());
		result = prime * result + ((output == null) ? 0 : output.hashCode());
		result = prime * result
				+ ((predicate == null) ? 0 : predicate.hashCode());
		result = prime * result + ((solve == null) ? 0 : solve.hashCode());
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
		SplitModel other = (SplitModel) obj;
		if (constraint == null) {
			if (other.constraint != null)
				return false;
		} else if (!constraint.equals(other.constraint))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (decl == null) {
			if (other.decl != null)
				return false;
		} else if (!decl.equals(other.decl))
			return false;
		if (extended == null) {
			if (other.extended != null)
				return false;
		} else if (!extended.equals(other.extended))
			return false;
		if (function == null) {
			if (other.function != null)
				return false;
		} else if (!function.equals(other.function))
			return false;
		if (include == null) {
			if (other.include != null)
				return false;
		} else if (!include.equals(other.include))
			return false;
		if (init == null) {
			if (other.init != null)
				return false;
		} else if (!init.equals(other.init))
			return false;
		if (output == null) {
			if (other.output != null)
				return false;
		} else if (!output.equals(other.output))
			return false;
		if (predicate == null) {
			if (other.predicate != null)
				return false;
		} else if (!predicate.equals(other.predicate))
			return false;
		if (solve == null) {
			if (other.solve != null)
				return false;
		} else if (!solve.equals(other.solve))
			return false;
		return true;
	}


	/**
	 * Obtains a variable declaration given its identifier.
	 * @param id The identifier.
	 * @return The variable declaration, or null if the identifier does not correspond to
	 * a variable
	 */
	public VarDecl getVarByName(ID id) {
		VarDecl r = null;
		for (Decl d:this.decl) 
			if (d instanceof VarDecl && d.getID().equals(id)){
				r = (VarDecl) d;
				break;
			}
				
		return r;
	}


	@Override
	public DataConsData getDataByConsName(String consname) {
		DataConsData r = null;
		if (data!=null) {
			int n = data.size();
			DataDef d = null;
		    for(int i=0; i<n && r==null; i++) {
		    	d = data.get(i);
		    	r = d.getDataByConsName(consname);
		    }
		}
		return r;
	}
	





}
