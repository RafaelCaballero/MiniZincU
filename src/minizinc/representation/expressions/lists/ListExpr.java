/**
 * 
 */
package minizinc.representation.expressions.lists;

import minizinc.antlr4.MiniZincGrammarParser.ListExprContext;
import minizinc.antlr4.MiniZincGrammarParser.ListValueContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import minizinc.representation.expressions.Expr;

/**
 * Main class representing lists. It is an abstract class used just to inherit and 
 * to determine the type.<br>
 * Grammar:<br>
 * listExpr: listValue<br> 
 *         | listExpr '++' listExpr<br>
 *         | oneDimList <br>
 *         | multiDimList ;<br>
 *
 * 
 * @author rafa
 *
 */
public abstract class ListExpr extends Expr {

	
	/* (non-Javadoc)
	 * @see minizinc.representation.Typeable#type()
	 */
	@Override
	public TypeName type() {
		// TODO Auto-generated method stub
		return TypeName.LIST;
	}
	
	/**
	 * Grammar piece: listExpr: listValue | listExpr '++' listExpr | oneDimList |
	 * multiDimList ;
	 */
	public static ListExpr listExpr(ListExprContext lec) {
		ListExpr t = null;
		// 4 possibilities according to the grammar
		if (Parsing.has(lec.listValue())) {
			ListValueContext lvc = lec.listValue();
			t = ListValue.listValue(lvc);
		} else if (Parsing.has(lec.listExpr(0))) {
			ListExpr t1 = listExpr(lec.listExpr(0));
			ListExpr t2 = listExpr(lec.listExpr(1));
			t = new InfixListExpr("++",t1,t2);

		} else if (Parsing.has(lec.oneDimList())) {
			t = OneDimList.oneDimList(lec.oneDimList());
		} else if (Parsing.has(lec.multiDimList())) {
			t = MultiDimList.multiDimList(lec.multiDimList());
		} else
			Parsing.error("list:  " + lec.toString());
		return t;
	}




}
