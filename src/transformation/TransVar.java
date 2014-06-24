package transformation;

import java.util.ArrayList;
import java.util.List;

import program.Constraint;
import terms.BoolC;
import terms.Var;

public class TransVar {
	private  List<Var>  var = new ArrayList<Var>();
	Constraint ctr =  new Constraint(new BoolC(true)) ;

	
	public TransVar() {
	}
	
	 
	public TransVar(List<Var> var) {
		this.var = var;
	}
	
	public TransVar(List<Var> var, Constraint ctr) {
		this.var = var;
		this.ctr = ctr;
	}
	public List<Var> getVar() {
		return var;
	}
	public void setVar(List<Var> var) {
		this.var = var;
	}
	public Constraint getCtr() {
		return ctr;
	}
	public void setCtr(Constraint ctr) {
		this.ctr = ctr;
	}
	
	@Override
	public String toString() {
		String s = var.toString(); 
		return  s+ "|" + ctr.toString();
	}


}
