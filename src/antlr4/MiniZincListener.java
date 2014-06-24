/**
 * 
 */
package antlr4;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import terms.*;
import datatypes.*;
import antlr4.MiniZincGrammarParser.*;
import program.*;

/**
 * @author rafa
 *
 */
public class MiniZincListener extends MiniZincGrammarBaseListener {
    private Program pu;
	private MiniZincGrammarParser parser;
	public MiniZincListener(MiniZincGrammarParser parser, Program pu) {
		this.parser=parser; 
		this.pu = pu;
	}
	
	// data declaration
	@Override public void exitData(@NotNull MiniZincGrammarParser.DataContext ctx) {
	    String id = ctx.ID().getText();
	    String tid = id;

	    // tunion
	    Tunion item  = new Tunion(tid);
	    pu.getUnion().add(item);
	    
	    
		
		////////// Datadef
		SDataDef itemdef = new SDataDef(tid);
		itemdef.setDataName(item);
		pu.getData().add(itemdef);

		List<ConstrContext> lconstr = ctx.constr();
		int n = lconstr.size();
		if (n==0)
			System.out.println("ERROR: data type "+id+" without constructors");
		else
			for(ConstrContext c : lconstr) {
				dealConst(itemdef,c);
		        //System.out.println(c.getText());
		    }				
			
	}
	
	public void dealConst(SDataDef itemdef, ConstrContext c) {
        // constructor without arguments  
		if (c.scons()!=null) { 
        	  SconsContext sc = c.scons();
        	  itemdef.addCons(sc.getText());
  
          }
		// constructor with arguments 
          else {
        	  TconsContext tctxt = c.tcons();
        	  List<ArgContext> ltypes = tctxt.arg();
        	  String constrName = tctxt.ID().getText();
        	  
        	  Tcons tc = new Tcons(constrName);
        	  for(ArgContext arg: ltypes) {
        		  Type t = null;
        		  ArgfloatContext af = arg.argfloat();
        		  ArgintContext ai = arg.argint();        		  
        		  ArgboolContext ab = arg.argbool();
        		  ArgunionContext au = arg.argunion();
        		  ArgrangeContext ar  = arg.argrange();
        		  if (af!=null) t = new Tfloat();
        		  else if (ai!=null) t = new Tint();
        		  else if (ab!=null) t = new Tbool();
        		  else if (au!=null) t = new Tunion(au.getText());
        		  else if (ar!=null)  {
        			  RangeContext range = ar.range();
        			  String start = range.fromR().getText();
        			  String stop = range.toR().getText();
        			  try {
        				  int istart = Integer.parseInt(start);
        				  int istop = Integer.parseInt(stop);
        				  t = new Trange(istart,istop);
        				  
        			  } catch(Exception e) {
        				  System.out.println("ERROR: unexpected variable range type "+c.toString());
        				  //System.out.println(e);
        			  }
        		  }
        		  
        		  tc.add(t);
        	  }
        	  itemdef.addCons(tc);
          }
         
	}
    
	// var declaration
	@Override public void exitVar(@NotNull MiniZincGrammarParser.VarContext ctx) { 
		String varname = ctx.ID().getText();
		TypenameContext tctx = ctx.typename();
		int level = 0;
		Type t = null;
		RintContext tint = tctx.rint();
		RboolContext tbool = tctx.rbool();
		RfloatContext tfloat = tctx.rfloat();
		TerminalNode  tid = tctx.ID();
	    TypedataContext tdata = tctx.typedata();
	    RangeContext trange = tctx.range();
	    
	    if (tint !=null) t = new Tint();
	    else if (tbool != null) t = new Tbool();
	    else if (tfloat != null) t = new Tfloat();
	    else if (tid != null) System.out.println("ERROR: Union type variable without level "+ctx.toString());
	    else if (tdata != null) {
	    	String tname = tdata.ID().getText();
	    	t = new Tunion(tname);
	    	String ti = tdata.INT().getText();
	    	try {
	    		level = Integer.parseInt(ti);
			} catch(Exception e) {
				  System.out.println("ERROR: unexpected level in var. declaration "+ctx.toString());
				  //System.out.println(e);
			}
	    	
	    }
	    else if (trange != null) {
			  String start = trange.fromR().getText();
			  String stop = trange.toR().getText();
			  try {
				  int istart = Integer.parseInt(start);
				  int istop = Integer.parseInt(stop);
				  t = new Trange(istart,istop);
				  
			  } catch(Exception e) {
				  System.out.println("ERROR: unexpected variable range type "+ctx.toString());
				  //System.out.println(e);
			  }
	    	
	    }
	    else  System.out.println("ERROR: unexpected variable type "+ctx.toString());
	    	
		Var v = new Var(varname,t,level);
		pu.getVar().add(v);
		//pu.getOutput().add(new Show(v));		
	}

	// an expression
	@Override public void exitExpr(@NotNull MiniZincGrammarParser.ExprContext ctx) { 
	}
	
	@Override public void exitConstraint(@NotNull MiniZincGrammarParser.ConstraintContext ctx) {
		ExprContext e = ctx.expr();
		Term t = parseExpr(e);
		Constraint c = new Constraint(t);
		pu.add(c);
		
	}

	private Term parseExpr(ExprContext e) {
		Term t = null;
		// some expressions are distinguished using the number of children
		int n = e.getChildCount();
		
		switch(n) {	
		case 3:  // \/, /\, ->, =, *, /, +, -, 
			String  op = e.getChild(1).getText();
			ExprContext e1 = e.expr(0);
			ExprContext e2 = e.expr(1);
			Term t1 = parseExpr(e1);
			Term t2 = parseExpr(e2);
		    t = createBinExpr(op,t1,t2); 
			break;
			
		case 1:    // notExpr, minusExpr, INT, BOOLEXpr, predOrUnionExpr, idexpr
			if (e.notExpr() != null) {
				ExprContext ep = e.notExpr().expr();
				Term tp = parseExpr(ep);
				t = new UnaryExp("not",tp);
			} else if (e.minusExpr() != null) {
				ExprContext ep = e.minusExpr().expr();
				Term tp = parseExpr(ep);
				t = new UnaryExp("-",tp);				
			} else if (e.rbracketExpr() != null) {
				ExprContext ep = e.rbracketExpr().expr();
				Term tp = parseExpr(ep);
				t = tp;				
			} else if (e.INT()!=null) {
				try {
				  int i = Integer.parseInt(e.getText());
				  t = new IntC(i);
				} catch(Exception excep) {
					System.out.println("Error unexpected integer: "+e.getText());
				}
			} else if (e.boolExpr() != null) {
				BoolExprContext cp = e.boolExpr();
				t = cp.getText().toUpperCase().equals("TRUE") ? new  BoolC(true) : new BoolC(false);  
			} else if (e.predOrUnionExpr() != null) {
				PredOrUnionExprContext cp = e.predOrUnionExpr();
				t = predOrUnion(cp);
			} else if (e.idexpr() != null) {
				IdexprContext cp = e.idexpr();
				t = idExpression(cp);								
			} else if (e.stringExpr() != null) {
				String s = ((StringExprContext) e.stringExpr()).string().getText();
				t = new StringC(s);								
			} else if (e.showExpr() != null) {
				String id = e.showExpr().ID().getText();
				// is a variable?
				Var v = pu.getVarByName(id);
				
				if (v!=null) 
					t = new Show(v);
				else  // I don't know what is this
					System.out.println("Error: unexpected identifier "+id+" in show term");					
			} else
				System.out.println("Error: unexpected "+n+" params expression *"+e.getText()+"*");

			break;
		default:
			break;
		}
		
			// System.out.println("===>"+n+" params: "+e.getText());
		
		return t;
	}
	
	private Term createBinExpr(String op,Term t1,Term t2) {
		Term t = null;
		if (op.equals("/\\"))
			 t = new And(t1,t2);
		else if (op.equals("->"))
			 t = new Imply(t1,t2);
		else if (op.equals("<-"))
			 t = new Imply(t2,t1);
		else 
			 t = new BinExp(op,t1,t2);
		return t;
	}
	private Term idExpression(IdexprContext cp) {
		Term t=null;
		String id = cp.ID().getText();
		
		// is a constructor?
		SDataDef d=null;
		Tcons c = null;
		for(SDataDef dp:pu.getData()) {
			if (dp.getConsByName(id)!=null) {
				d = dp;
				c = dp.getConsByName(id);
			}
		}
		
		if (d!=null) {
			List<Term> lt = new ArrayList<Term>();
			CTerm ct = new CTerm();
			ct.setCons(id);
			ct.setArgs(lt);
			t = ct;
			
		} else {
			// is a variable?
			Var v = pu.getVarByName(id);
			
			if (v!=null) {
				t = v;
			} else { // I don't know what is this
				System.out.println("Error: unexpected identifier "+id+"");
				
			}
				
		} 

		return t;
		
	}
	private Term predOrUnion(PredOrUnionExprContext cp) {
		Term t = null;
			
		String id =cp.ID().getText();
		// is a constructor?
		SDataDef d=null;
		Tcons c = null;
		for(SDataDef dp:pu.getData()) {
			if (dp.getConsByName(id)!=null) {
				d = dp;
				c = dp.getConsByName(id);
			}
		}

		List<ParseTree> l = cp.children;
		//for(ParseTree pt:l) System.out.println("|"+pt.getText()+"|");				
					
		int n = (cp.getChildCount()-2) /  2;
		List<Term> lt = new ArrayList<Term>();
		for (int i=0; i<n; i++) {
			ExprContext arg = cp.expr(i);
			Term tArg = parseExpr(arg);
			lt.add(tArg);
			//System.out.println("Argument : "+i+": "+cp.expr(i).getText());
		}
		
		if (d != null) {
			int m = c.getSubtypes().size();	
			if (n==m) {
				CTerm ct = new CTerm();
				ct.setArgs(lt);
				ct.setCons(id);
				t = ct;			
			} else {
				System.out.println("Error: invalid number of arguments "+cp.getText());
				System.out.println("       expected number of arguments: "+m+", actual number: "+n);
			}			
		}
		else { // predicate
			PredicateCall pc = new PredicateCall(id,lt);
			t = pc;						
		}
			
		//System.out.println(t.toString());
        return t;
	}
	
	private Constraint expr2Constraint(ExprContext e) {
		Constraint c = null;
		int n = e.getChildCount();
		if (n==1) { // either a constant or a boolean variable
           if (e.boolExpr() != null)
        	   if (e.getText().equals("true")) c = new Constraint(new BoolC(true)) ;
        	   else c = new Constraint(new BoolC(false)) ;
           else 
        	   if (e.idexpr() != null) {
        		   String varname = e.getText();
        		   Var v = pu.getVarByName(varname);
        		   if (v.getT().getType()!=TType.BOOL) {
        			   System.out.println("Error: invalid constraint type, non-bool identifier "+varname);
        		   } else {
        			;   
        		   }
        	   }          	   
            else if (e.INT()!=null) { 
        		   String s = e.getText();
        		   int i = Integer.parseInt(s);
        		   c = new Constraint(new IntC(i));
        	   } 
        	else if (e.stringExpr()!=null) { 
        		c = new Constraint (new StringC(e.getText()));
        	} else {
        		   System.out.println("Error: invalid constraint type" + e.getText());
        	   }
		} // n==1        	   
          else /* if (n==3) {
        	 ParseTree t1 = e.getChild(1);
        	 if (t1.getText().equals("=")) {
        		 ExprContext e1 = e.expr(0);
        	     ExprContext e2 = e.expr(1);
        	     System.out.println(e1.getText());
        	     System.out.println(e2.getText());
        	 }*/
        	 System.out.println("Error: unexpected arity ("+n+")");
         
		
		return c;
	}

	@Override 
	public void exitOutput(@NotNull MiniZincGrammarParser.OutputContext ctx) {
		List<ExprContext> lc = ctx.list().expr();
		Term t = null;
		for (ExprContext ec:lc) {
			t = parseExpr(ec);
			pu.addOutput(t);
		}
	}

	public ProgramU getProgramU() {
		return pu;
	}
}
