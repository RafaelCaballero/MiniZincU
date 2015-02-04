package transformation;

import java.util.ArrayList;
import java.util.List;

import minizinc.representation.Parsing;
import minizinc.representation.expressions.And;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.Imply;
import minizinc.representation.expressions.InfixExpr;
import minizinc.representation.expressions.InfixOp;
import minizinc.representation.expressions.IntC;
import minizinc.representation.expressions.RbracketExpr;
import minizinc.representation.model.SplitModel;
import minizinc.representation.statement.Constraint;
import minizinc.representation.statement.Comment;
import minizinc.representation.statement.DataDef;
import minizinc.representation.statement.Extended;
import minizinc.representation.statement.decls.VarDecl;
import minizinc.representation.types.Rbool;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeID;
import minizinc.representation.types.TypeRange;
import minizinc.representation.types.TypeUnion;

/*
 * Represents the the transformation of a variable
 */
public class TransVar {
	/**
	 * Var to be transformed
	 */
	protected VarDecl v;
	/**
	 * The variable is transformed into a list of variables
	 */
	protected List<VarDecl> var;
	// boolean variables for intermediate constraints
	protected List<VarDecl> varb;
	/**
	 * The transformation yields new constraints
	 */
	protected List<Constraint> ctr;

	/**
	 * base model
	 */
	protected SplitModel p;

	/*
	 * Just for logging purposes
	 */
	protected Comment c;

	/**
	 * Constructs a TransVar object for variable v. This constructor also
	 * creates the transformation.
	 * 
	 * @param v
	 *            The variable that it is transformed.
	 * @param p
	 *            The base model
	 */
	public TransVar(VarDecl v, SplitModel p) {
		this.v = v;
		var = new ArrayList<VarDecl>();
		varb = new ArrayList<VarDecl>();
		ctr = new ArrayList<Constraint>();
		this.p = p;
		transvar();

		// just for logging purposes
		String scomment = v.print() + " transformed into "
				+ (var == null ? 0 : var.size()) + " vars + "
				+ (varb == null ? 0 : varb.size()) + " bvars + "
				+ (ctr == null ? 0 : ctr.size()) + " ctrs";
		c = new Comment(scomment);
	}

	public TransVar(VarDecl vp, List<VarDecl> varp, List<VarDecl> varb,
			List<Constraint> ctrp) {
		this.v = vp;
		this.var = varp;
		this.varb = varb;
		this.ctr = ctrp;
	}

	public List<VarDecl> getVar() {
		return var;
	}

	public List<VarDecl> getVarb() {
		return varb;
	}

	public void setVar(List<VarDecl> var) {
		this.var = var;
	}

	public List<Constraint> getCtr() {
		return ctr;
	}

	@Override
	public String toString() {
		String s = var.toString();
		String sb = varb.toString();
		return v.print() + "-> (" + s + ", " + sb + ") |" + ctr.toString();
	}

	public void transvar() {
		if ((v.getDeclType() instanceof TypeUnion)) {
			TypeUnion t = (TypeUnion) v.getDeclType();
			String typename = t.getId().print();

			DataDef d = p.getDataByName(typename);
			if (d == null)
				Parsing.error("Unexpected union type name " + typename);
			else
				transvarAux(d);

			// introduce the possible initialization as a constraint
			Expr e = v.getExpr();
			if (e != null) {
				InfixExpr eq = new InfixExpr(new InfixOp("="), v.getID(), e);
				ctr.add(new Constraint(eq));
			}

		} else
			// if is of standard type is transformed into itself
			var.add(v);

	}

	private void transvarAux(DataDef d) {
		int size = d.getCons().size();
		TypeRange newt = new TypeRange(1, size);
		VarDecl nv = new VarDecl(newt, v.getID());
		getVar().add(nv);
		// companion boolean variable
		VarDecl nvb = new VarDecl(new Rbool(), v.getID() + "_b");
		int varbpos = getVarb().size();
		getVarb().add(nvb);

		if (v.getLevel() <= 0) {
			List<Expr> lt = new ArrayList<Expr>();
			// if the level is 0 it only can be a constant;
			// generate the constraints ensuring that
			for (int i = 0; i < size; i++) {
				List<Type> subtypes = d.getCons().get(i).getSubtypes();
				int nconst = subtypes == null ? 0 : subtypes.size();
				// in the level 0 the variable cannot take the index of any
				// non-constant constructor
				if (nconst > 0) {
					IntC iplus1 = new IntC(i + 1);
					InfixExpr neq = new InfixExpr(new InfixOp("!="),
							nv.getID(), iplus1);
					lt.add(neq);
				}
			}
			if (lt != null && lt.size() > 0) {
				And beand = new And(lt);
				InfixExpr ie = new InfixExpr("=", nvb.getID(),
						new RbracketExpr(beand));

				ctr.add(new Constraint(ie));
			} else
				// no constraint added; them the boolean variable is not
				// necessary!
				getVarb().remove(varbpos);

		} else {
			// n>0

			// recursive calls
			List<List<TransVar>> recursive = recursiveCalls(v, d, size);

			List<Expr> bigCtrl = new ArrayList<Expr>();
			// create Transvar associated to each constructor
			for (int i = 0; i < size; i++) {
				// list of variables generated by the i-th constructor
				List<TransVar> auxrec = recursive.get(i);
				if (auxrec != null && auxrec.size() != 0) {
					addNew(i, auxrec, nv.getID(), bigCtrl);
				}
			}
			if (bigCtrl != null && bigCtrl.size() > 0) {
				And bigCtre = new And(bigCtrl);
				InfixExpr ie = new InfixExpr("=", nvb.getID(),
						new RbracketExpr(bigCtre));
				Constraint bigCtr = new Constraint(ie/* .simplify() */);
				ctr.add(bigCtr);
			} else
				// no constraint added; them the boolean variable is not
				// necessary!
				getVarb().remove(varbpos);

		}

	}

	/**
	 * Adds the new variables and constraints generated by the transformation of
	 * a data variable related to the constructor i-th
	 * 
	 * @param i
	 *            Number of constructor
	 * @param auxrec
	 *            List of variable transformations associated to the i-th
	 *            constructor. It is assumed to have at least one element.
	 * @param id
	 *            Identifier of the variable
	 * @param bigCtrl
	 *            List of constraints. It is assumed to be different from null.
	 */
	private void addNew(int i, List<TransVar> auxrec, ID id, List<Expr> bigCtrl) {
		IntC iplus1 = new IntC(i + 1);
		InfixExpr neq = new InfixExpr("!=", id, iplus1);
		InfixExpr eq = new InfixExpr("=", id, iplus1);

		List<Expr> c1Auxl = new ArrayList<Expr>();
		List<Expr> c2Auxl = new ArrayList<Expr>();

		for (TransVar j : auxrec) {
			// incorporate new variables
			List<VarDecl> lnv = j.getVar();
			getVar().addAll(lnv);
			List<VarDecl> lnvb = j.getVarb();
			getVarb().addAll(lnvb);

			ctr.addAll(j.getCtr());
			List<Expr> czl = new ArrayList<Expr>();
			for (VarDecl vz : j.getVar()) {
				ID vzid = vz.getID();
				Type vztype = vz.getDeclType();
				InfixExpr zeq = null;
				if (vztype instanceof TypeID) {
					String name = ((TypeID) vztype).getId().print();
					Extended ex = p.getExtensionByName(name);
					zeq = new InfixExpr("=", vzid, ex.zero());
				} else
					zeq = new InfixExpr("=", vzid, vztype.zero());
				czl.add(zeq);

			}
			And cz = new And(czl);
			c1Auxl.add(cz);
			if (lnvb != null && lnvb.size() > 0)
				c2Auxl.add(lnvb.get(0).getID()); // the constraint
													// corresponds
													// to
													// the first
													// variable
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

	public static String newVarName(String name, int i, int j) {
		return name + "_" + i + "_" + j;
	}

	/**
	 * @param v
	 *            Variable of type d
	 * @param d
	 *            A data definition
	 * @param size
	 *            Number of constructors defininig the data type
	 * @return
	 */
	private List<List<TransVar>> recursiveCalls(VarDecl v, DataDef d, int size) {
		List<List<TransVar>> result = new ArrayList<List<TransVar>>();
		int l = v.getLevel() - 1;
		// for each constructor defining the datatype....
		for (int i = 0; i < size; i++) {
			List<Type> subtypes = d.getCons().get(i).getSubtypes();
			int nconst = subtypes == null ? 0 : subtypes.size();
			List<TransVar> auxrec = new ArrayList<TransVar>();
			// for each subtype of the i-th constructor...
			for (int j = 0; j < nconst; j++) {
				String newname = newVarName(v.getID().print(), (i + 1), (j + 1));
				Type t = subtypes.get(j);
				if (t instanceof TypeID) {
					TypeID tid = (TypeID) t;
					// is this type a data type?
					DataDef def = p.getDataByName(tid.getId().print());
					if (def == null) {
						// it is not a data name
						VarDecl varaux = new VarDecl(t, newname);
						TransVar x = new TransVar(varaux, p);
						auxrec.add(x);
					} else { // a recursive type
						TypeUnion tu = new TypeUnion(tid.getId(), l);
						VarDecl varaux = new VarDecl(tu, newname);
						TransVar x = new TransVar(varaux, p);
						auxrec.add(x);
					}

				} else {
					// it is not a data name
					VarDecl varaux = new VarDecl(t, newname);
					TransVar x = new TransVar(varaux, p);
					auxrec.add(x);

				}
			}
			// add the translated list
			// if (auxrec != null && auxrec.size()!=0)
			result.add(auxrec);
		}
		return result;
	}

}
