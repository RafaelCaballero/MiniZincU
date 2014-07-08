package antlr4;

import java.util.ArrayList;
import java.util.List;

import antlr4.MiniZincGrammarParser.*;
import terms.*;

public  class MiniZinc2Java {
	/**
	 * Grammar piece:
	 * listExpr: listValue 
     * | listExpr '++' expr
     * | oneDimList 
     * | multiDimList ;
     */
	public static Term listExpr(ListExprContext lec) {
		Term t = null;
		// 4 possibilities according to the grammar
		if (lec.listValue() != null) {
			ListValueContext lvc = lec.listValue();
			t = listValue(lvc);
		}
		else if (lec.listExpr() != null){
			
		}
		else if (lec.oneDimList() != null) {
			
		}
		else if (lec.multiDimList() != null) {
			
		}
		else System.out.println("Parsed unexpected list:  "+lec.toString());
		return t;
	}

    /**	
	 * listValue : stringExpr 
	 *            | ID 
	 *            | ifExpr 
	 *            | arrayaccess 
	 *            | showExpr 
	 *            | inDecl 
	 *            | functionExpr;
     */
	public static Term listValue(ListValueContext lvc) {
		Term t = null;
		if (lvc.stringExpr() != null)
		else if (lvc.ID != null)
		return t;
	}

}
