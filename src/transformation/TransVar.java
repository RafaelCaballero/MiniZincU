package transformation;

import java.util.ArrayList;
import java.util.List;

import minizinc.representation.Parsing;
import minizinc.representation.expressions.And;
import minizinc.representation.expressions.BoolC;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.Imply;
import minizinc.representation.expressions.InfixExpr;
import minizinc.representation.expressions.InfixOp;
import minizinc.representation.expressions.IntC;
import minizinc.representation.model.Model;
import minizinc.representation.statement.Constraint;
import minizinc.representation.statement.DataDef;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeID;
import minizinc.representation.types.TypeRange;
import minizinc.representation.types.TypeUnion;


/*
 * Represents the the transformation of a variable
 */
public class TransVar implements Cloneable{
	/**
	 * Var to be transformed
	 */
	protected VarDecl v;
	/**
	 * The variable is transformed into a list of variables
	 */
	protected List<VarDecl> var;
	/**
	 * The transformation yields new constraints
	 */
	protected Constraint ctr;
	protected Constraint init; 

	public TransVar(VarDecl v, Model p) {
		this.v = v;
		var = new ArrayList<VarDecl>();
		ctr = new Constraint(new BoolC(true));
		init=null;
		transvar(p);
	}


	public TransVar(VarDecl vp, List<VarDecl> varp, Constraint ctrp,
			Constraint initp) {
		this.v = vp;
		this.var = varp;
		this.ctr = ctrp;
		this.init = initp;
	}


	public List<VarDecl> getVar() {
		return var;
	}

	public void setVar(List<VarDecl> var) {
		this.var = var;
	}

	public Constraint getCtr() {
		return ctr;
	}

	private void setCtr(Constraint ctr) {
		this.ctr = ctr;
	}

	@Override
	public String toString() {
		String s = var.toString();
		return v.print()+"->"+s + "|" + ctr.toString();
	}
	
	public void transvar(Model p) {
		if ((v.getDeclType() instanceof TypeUnion)) {
			TypeUnion t = (TypeUnion) v.getDeclType();
			String typename = t.getId().print();

			DataDef d = p.getDataByName(typename);
			if (d == null)
				Parsing.error("Unexpected union type name " + typename);
			else
				transvarAux(p,d);
			
			// introduce the possible initialization as a constraint
			Expr e = v.getExpr();
			if (e!=null) {
				InfixExpr eq = new InfixExpr(new InfixOp("="), v.getID(), e);
				init = new Constraint(eq);				
			}

		} else 
			// if is of standard type is transformed into itself
			var.add(v);
	

	}

	private void transvarAux(Model p, DataDef d)  {
		int size = d.getCons().size();
		TypeRange newt = new TypeRange(1, size);
		VarDecl nv = new VarDecl(newt,v.getID());
		getVar().add(nv);
		if (v.getLevel() <= 0) {
			List<Expr> lt = new ArrayList<Expr>();
			// if the level is 0 it only can be a constant; 
			// generate the constraints ensuring that
			for (int i = 0; i < size; i++) {
				List<Type> subtypes = d.getCons().get(i).getSubtypes();
				int nconst = subtypes==null ? 0 : subtypes.size();
				if (nconst > 0) {
					IntC iplus1 = new IntC(i + 1);
					InfixExpr neq = new InfixExpr(new InfixOp("!="), 
							             nv.getID(), iplus1);
					lt.add(neq);
				}
			}
			And beand = new And(lt);
			setCtr(new Constraint(beand.simplify()));
		} else {
			// n>0

			// recursive calls
			List<List<TransVar>> recursive = recursiveCalls(p,v, d, size);

			List<Expr> bigCtrl = new ArrayList<Expr>();
			// create Transvar
			for (int i = 0; i < size; i++) {
				List<TransVar> auxrec = recursive.get(i);
				IntC iplus1 = new IntC(i + 1);
				InfixExpr neq = new InfixExpr("!=", nv.getID(), iplus1);
				InfixExpr eq = new InfixExpr("=", nv.getID(), iplus1);

				List<Expr> c1Auxl = new ArrayList<Expr>();
				List<Expr> c2Auxl = new ArrayList<Expr>();

				for (TransVar j : auxrec) {
					// incorporate new variables
					List<VarDecl> lnv = j.getVar();
					getVar().addAll(lnv);
					c2Auxl.add(j.getCtr().getExpr());
					List<Expr> czl = new ArrayList<Expr>();
					for (VarDecl vz : j.getVar()) {
						InfixExpr zeq = new InfixExpr("=", vz.getID(), vz.getDeclType().zero());
						czl.add(zeq);

					}
					And cz = new And(czl);
					c1Auxl.add(cz);

				}

				And c1Aux = new And(c1Auxl);
				And c2Aux = new And(c2Auxl);
				Imply c1 = new Imply(neq, c1Aux);
				Imply c2 = new Imply(eq, c2Aux);
				boolean b1 = !c1.isTrue();
				boolean b2 = !c2.isTrue();

				if (b1 || b2) {
					Expr c = null;
					if (b1 && b2)
						c = new And(c1, c2);
					else if (b1)
						c = c1;
					else
						c = c2;
					bigCtrl.add(c);
				}

			}
			And bigCtre = new And(bigCtrl);
			Constraint bigCtr = new Constraint(bigCtre.simplify());
			setCtr(bigCtr);

		}

	}


	public static String newVarName(String name, int i, int j) {
		return name + "_" + i + "_" + j;
	}

	private List<List<TransVar>> recursiveCalls(Model p, VarDecl v, DataDef d, int size)
			 {
		List<List<TransVar>> result = new ArrayList<List<TransVar>>();
		int l = v.getLevel() - 1;
		for (int i = 0; i < size; i++) {
			List<Type> subtypes =  d.getCons().get(i).getSubtypes();
			int nconst = subtypes==null ? 0 : subtypes.size();
			List<TransVar> auxrec = new ArrayList<TransVar>();
			for (int j = 0; j < nconst; j++) {
				String newname = newVarName(v.getID().print(), (i + 1), (j + 1));
				Type t = subtypes.get(j);
				if (t instanceof TypeID) {
					TypeID tid = (TypeID) t;
					// is this type a data type?
					DataDef def = p.getDataByName(tid.getId().print());
					if (def==null) {
						// it is not a data name
						VarDecl varaux = new VarDecl(t,newname);
						TransVar x = new TransVar(varaux,p);
						auxrec.add(x);
					} else { // a recursive type 
						TypeUnion tu = new TypeUnion(tid.getId(),l);
						VarDecl varaux = new VarDecl(tu,newname);
						TransVar x = new TransVar(varaux,p);
						auxrec.add(x);
					}
						
				} else {
					// it is not a data name
					VarDecl varaux = new VarDecl(t,newname);
					TransVar x = new TransVar(varaux,p);
					auxrec.add(x);
					
				}
			}
			result.add(auxrec);
		}
		return result;
	}

	
	public TransVar clone() {
		TransVar r = null;
		VarDecl vp = v==null ? null : v.clone();
		List<VarDecl> varp=null;
		Constraint ctrp = ctr ==null ? null : ctr.clone();
		Constraint initp = init==null ? null : init.clone();
		if (var!=null) {
			varp = new ArrayList<VarDecl>();
			for(VarDecl v:var)
				varp.add(v.clone());
		}

		r = new TransVar(vp,varp,ctrp,initp);
		return r;
	}


	public Constraint getInit() {
		return init;
	}

}
