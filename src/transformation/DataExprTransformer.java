/**
 * 
 */
package transformation;

import java.util.List;

import minizinc.representation.DataDef.DataConsData;
import minizinc.representation.expressions.BoolExpr;
import minizinc.representation.expressions.BoolVal;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.InfixArithExpr;
import minizinc.representation.expressions.InfixBoolExpr;
import minizinc.representation.expressions.InfixExpr;
import minizinc.representation.expressions.NotBoolExpr;
import minizinc.representation.expressions.PredOrUnionExpr;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.TypeUnion;



/**
 * Transforms expressions related to union definitions
 * @author rafa
 *
 */
public class DataExprTransformer  implements ExprTransformer{
	protected SplitModel m;

	public DataExprTransformer(SplitModel m) {
		this.m = m;
	}

	
	public Expr transform(Expr e) {
		Expr r = null;
		
		boolean isInfixBoolExpr = e instanceof InfixBoolExpr;
		boolean isInfixExpr = e instanceof InfixExpr;  
		boolean isInfixArithExpr = e instanceof InfixArithExpr;
		if (isInfixBoolExpr)
			r = inFixBoolExpr((InfixBoolExpr) e);
		else if (isInfixExpr)
			r = infixExpr( (InfixExpr) e);
		else if (isInfixArithExpr)
			r = infixArithExpr((InfixArithExpr) e);
		
		/*
		VarDecl v = null;
		DataEqualTransformer de = new DataEqualTransformer(m);
		System.out.println("******");
		for (VarDecl x: de.getVars(v))
		    System.out.println(x.print(10));
		System.out.println("******");
        */
		return r;
	}


	private Expr infixArithExpr(InfixArithExpr e) {
		Expr r = null;
		
		return r;
	}


	private Expr infixExpr(InfixExpr e) {
		Expr r = null;
		List<Expr> le = e.getE();
		String op  = e.getOp().getInfixSetOp();
		
		return r;
	}


	private Expr inFixBoolExpr(InfixBoolExpr e) {
		Expr r = null;
		BoolExpr e1 = e.getE1();
		BoolExpr e2 = e.getE2();
		String op = e.getOp();
		
		if (equalOp(op) && e1 instanceof BoolVal && e2 instanceof BoolVal ) {
			BoolVal val1 = (BoolVal) e1;
			BoolVal val2 = (BoolVal) e2;
			r = transformEqual(op,val1.getE(), val2.getE());
		}
		
		return r;
	}

	private Expr transformEqual(String op, Expr e1, Expr e2) {
		Expr r = null;
		
		VarDecl v1=null;
		VarDecl v2=null;
		PredOrUnionExpr ped1=null;
		PredOrUnionExpr ped2=null;

		DataConsData d1=null;
		DataConsData d2=null;

		// first look for variables
		if (e1 instanceof ID) 
			v1 = isUnionVar((ID)e1);
		
		if (e2 instanceof ID) 
			if (v1==null)
				v1 = isUnionVar((ID)e2);
			else
				v2 = isUnionVar((ID)e2);

		// next for 0-arity preds
		if (e1 instanceof ID) 
			if (v1==null)
				   d1 = isConstructedTerm((ID)e1);
			else if (v2==null) 
				   d2 = isConstructedTerm((ID)e1);	
		
		if (e2 instanceof ID)
			if (v2==null) 
				d2 = isConstructedTerm((ID)e2);

		// finally, constructed terms
		if (e1 instanceof PredOrUnionExpr)
			if (v1==null && d1==null){
			   d1 = isConstructedTerm((PredOrUnionExpr)e1);
			   ped1 = (PredOrUnionExpr)e1;
			}
			else {
				   d2 = isConstructedTerm((PredOrUnionExpr)e1);
				   ped2 = (PredOrUnionExpr)e1;
			}			
		if (e2 instanceof PredOrUnionExpr) { 
			d2 = isConstructedTerm((PredOrUnionExpr)e2);
			    ped2 = (PredOrUnionExpr)e2;
		}
		
		// call the appropriate method 
		if (v1!=null)
			if (v2!=null){
				DataEqualTransformer d = new DataEqualTransformer(m);
				r = d.equalVars(v1, v2);
			}
				
				
		if (r!=null && op.equals("!=")){
			r = new NotBoolExpr(r);
				
			}
		
		return r;
	}
	/**
	 * The parameter is a constructed dataterm?
	 * @param e PredOrUnionExpr to check 
	 * @return The constructor data if it is a constructor, null otherwise
	 */
	private DataConsData isConstructedTerm(PredOrUnionExpr e) {
		String outc = e.getId().print();
		DataConsData d = m.getDataByConsName(outc);
		
		return d;
	}



	/**
	 * The parameter is a constructed dataterm?
	 * @param e PredOrUnionExpr to check 
	 * @return The position of the constructor in its data def. 
	 * 0 if it is not a constructor
	 */
	private DataConsData isConstructedTerm(ID e) {
		DataConsData d = m.getDataByConsName(e.print());
		// check that is really a 0 arity constructor
		if (d!=null && d.getCons().getSubtypes()!=null && d.getCons().getSubtypes().size()>0)
			d=null;
		return d;
	}

	/**
	 * Checks if the string is =, == or !=
	 * @param s The string 
	 * @return true if is an equality/disequality operation
	 */
	private boolean equalOp(String s) {
		return s!=null && (s.equals("=") || s.equals("==") || s.equals("!=")); 
	}
	
	private VarDecl isUnionVar(ID id) {
		VarDecl r=null;
		VarDecl v = m.getVarByName(id);
		if (v!=null && v.getDeclType() instanceof TypeUnion) 
				r = v;
	
		return r;
	}
    	
}
