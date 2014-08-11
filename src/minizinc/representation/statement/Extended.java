package minizinc.representation.statement;

import java.util.ArrayList;
import java.util.List;

import minizinc.antlr4.MiniZincGrammarParser.ExtendedContext;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.Expr;
import minizinc.representation.expressions.ID;
import minizinc.representation.types.Type;

/**
 * extended: 'extended' ID '=' (preExt '++')? typename ('++' postExt)?;<br>
 * listExtended : '[' ID(',' ID)* ']';<br>
 * preExt : listExtended;<br>
 * postExt : listExtended;<br>

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

	public Extended(ID name, Type baseName, List<ID> left,
			List<ID> right) {
		super(TStatement.EXTENDED);

		dataName = name;
		this.baseType =  baseName;
		this.left = left;
		this.right = right;
	}

	public String print() {
		String s = "";
		String sl = "["+printList(left)+"]";
		String sr = "["+printList(right)+"]";

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


	@Override
	public List<Expr> subexpressions() {
		// no subexpressions
		return null;
	}

	public static Extended extended(ExtendedContext ctx) {
		Extended r = null;
		List<ID> left = new ArrayList<ID>();
		List<ID> right = new ArrayList<ID>();

		if (Parsing.hasTerminal(ctx.ID()) && Parsing.has(ctx.typename()) && 
				Parsing.has(ctx.preExt()) &&	Parsing.has(ctx.postExt()) ) {
			ID id = ID.IDTerm(ctx.ID());
			Type basetype = Type.typename(ctx.typename());
			ctx.preExt().listExtended().ID().forEach(x -> left.add(ID.IDTerm(x)));
			ctx.preExt().listExtended().ID().forEach(x -> right.add(ID.IDTerm(x)));
			r = new Extended(id,basetype,left,right);
			
		} else Parsing.error("Wrong Extended statement: "+ctx.getText());
		return r;
	}

}
