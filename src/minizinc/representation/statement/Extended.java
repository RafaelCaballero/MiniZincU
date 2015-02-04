package minizinc.representation.statement;

import java.util.ArrayList;
import java.util.List;

import transformation.ExprTransformer;
import minizinc.antlr4.MiniZincGrammarParser.ExtendedContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.BoolC;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.FloatC;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.IntC;
import minizinc.representation.types.Rbool;
import minizinc.representation.types.Rfloat;
import minizinc.representation.types.Rint;
import minizinc.representation.types.Type;
import minizinc.representation.types.TypeRange;

/**
 * extended: 'extended' ID '=' (preExt '++')? typename ('++' postExt)?;<br>
 * listExtended : '[' ID(',' ID)* ']';<br>
 * preExt : listExtended;<br>
 * postExt : listExtended;<br>
 * 
 * @author rafa
 *
 */
public class Extended extends Statement {
	private ID dataName;
	private Type baseType;
	private List<ID> left;
	private List<ID> right;

	public Extended(String name) {
		super(TStatement.EXTENDED);
		dataName = ID.IDTerm(name);
		this.baseType = null;
		left = right = null;
	}

	public Extended(ID name, Type baseName, List<ID> left, List<ID> right) {
		super(TStatement.EXTENDED);

		dataName = name;
		this.baseType = baseName;
		this.left = left;
		this.right = right;
	}

	@Override
	public Extended clone() {
		Extended r = null;
		ID dataNamep;
		Type baseTypep = null;
		List<ID> leftp = null;
		List<ID> rightp = null;

		dataNamep = dataName.clone();
		if (baseType != null)
			baseTypep = baseType.clone();
		if (left != null) {
			leftp = new ArrayList<ID>();
			for (ID l : left)
				leftp.add(l.clone());

		}
		if (right != null) {
			rightp = new ArrayList<ID>();
			for (ID ri : right) {
				rightp.add(ri.clone());
			}

		}
		r = new Extended(dataNamep, baseTypep, leftp, rightp);
		return r;
	}

	public String print() {
		String s = "";
		String sl = "[" + printList(left) + "]";
		String sr = "[" + printList(right) + "]";

		s = "extended " + dataName.print() + " = " + sl
				+ (sl.length() == 0 ? "" : "++") + baseType.print()
				+ (sr.length() == 0 ? "" : "++") + sr;

		return s;
	}

	/**
	 * @return the dataName
	 */
	public String getDataName() {
		return dataName.print();
	}

	/**
	 * @return the baseName
	 */
	public String getBaseName() {
		return baseType.print();
	}

	/**
	 * @return the left
	 */
	public List<ID> getLeft() {
		return left;
	}

	/**
	 * @return the right
	 */
	public List<ID> getRight() {
		return right;
	}

	public static Extended extended(ExtendedContext ctx) {
		Extended r = null;
		List<ID> left = new ArrayList<ID>();
		List<ID> right = new ArrayList<ID>();

		if (Parsing.hasTerminal(ctx.ID()) && Parsing.has(ctx.typename())
				&& Parsing.has(ctx.preExt()) && Parsing.has(ctx.postExt())) {
			ID id = ID.IDTerm(ctx.ID());
			Type basetype = Type.typename(ctx.typename());
			ctx.preExt().listExtended().ID()
					.forEach(x -> left.add(ID.IDTerm(x)));
			ctx.preExt().listExtended().ID()
					.forEach(x -> right.add(ID.IDTerm(x)));
			r = new Extended(id, basetype, left, right);

		} else
			Parsing.error("Wrong Extended statement: " + ctx.getText());
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((baseType == null) ? 0 : baseType.hashCode());
		result = prime * result
				+ ((dataName == null) ? 0 : dataName.hashCode());
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
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
		Extended other = (Extended) obj;
		if (baseType == null) {
			if (other.baseType != null)
				return false;
		} else if (!baseType.equals(other.baseType))
			return false;
		if (dataName == null) {
			if (other.dataName != null)
				return false;
		} else if (!dataName.equals(other.dataName))
			return false;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		return true;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		ID dataName2 = this.applyTransformer2(t, dataName);
		List<ID> left2 = this.applyTransformerList2(t, left);
		List<ID> right2 = this.applyTransformerList2(t, right);
		dataName = dataName2;
		left = left2;
		right = right2;
	}

	public Expr zero() {
		Expr r = null;
		if (left != null && left.size() > 0) {
			r = left.get(0);
		} else {
			if (baseType instanceof Rbool)
				r = new BoolC(false);
			else if (baseType instanceof Rfloat)
				r = new FloatC(0.0);
			else if (baseType instanceof Rint)
				r = new IntC(0);
			else if (baseType instanceof TypeRange) {
				TypeRange tr = (TypeRange) baseType;
				r = tr.zero();
			}

		}

		return r;
	}

}
