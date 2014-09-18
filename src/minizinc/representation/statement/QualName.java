/**
 * 
 */
package minizinc.representation.statement;

import minizinc.antlr4.MiniZincGrammarParser.OpOrIDContext;
import minizinc.antlr4.MiniZincGrammarParser.QualNameContext;
import minizinc.representation.MiniZincRepresentation;
import minizinc.representation.Parsing;
import minizinc.representation.expressions.ID;
import minizinc.representation.expressions.InfixOp;

/**
 * @author rafa
 *
 */


class OpOrID  implements MiniZincRepresentation, Cloneable {
	protected ID id;
	protected String op;
	
	public OpOrID(ID id) {
		this.id = id;
		op = null;
	}

	public OpOrID(String op) {
		this.id = null;
		this.op = op;
		
	}
	public OpOrID(ID idp, String opp) {
		this.id = idp;
		this.op = opp;

	}

	public OpOrID(InfixOp op2) {
		if (op2.isID()){
			this.id = op2.getID();
			this.op = null;
			
		} else {
			this.id = null;
			this.op = op2.getInfixSetOp();

		}
			

	}

	public OpOrID(OpOrID op2) {
		this.id = op2.id;
		this.op = op2.op;
	}

	public static OpOrID opOrID(OpOrIDContext ctx) {
		OpOrID r = null;
		if (Parsing.hasTerminal(ctx.ID())) {
			ID id = ID.IDTerm(ctx.ID());
			r = new OpOrID(id); 
		} else if (Parsing.has(ctx.op())) {
			String op = ctx.op().getText();
			r = new OpOrID(op);
		} else Parsing.error("OpOrID "+ctx.getText());
		
		return r;
	}
	@Override
	public String print() {
		String s = id == null ? op : id.print();
		return s;
	}
	
    @Override 
    public OpOrID clone(){
    	OpOrID r=null;
    
		ID idp = id == null ? null : id.clone();
		String opp = op;
    		
    	r = new OpOrID(idp,opp);
    	return r;

    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((op == null) ? 0 : op.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OpOrID other = (OpOrID) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (op == null) {
			if (other.op != null)
				return false;
		} else if (!op.equals(other.op))
			return false;
		return true;
	}
}
 public class QualName implements MiniZincRepresentation, Cloneable {
	 protected OpOrID opid1;
	 protected OpOrID opid2;
	 protected boolean extendsmark;
		
	/**
	 * Constructor for names of the fom id1 extendsmark id2 or id1:id2 
	 * @param id12
	 * @param id22
	 * @param b
	 */
	public QualName(OpOrID opid1, OpOrID opid2, boolean b) {
		extendsmark = b;
		this.opid1=opid1;
		this.opid2 = opid2;		
	}

	public QualName(InfixOp op) {
		extendsmark = false;
		this.opid1=new OpOrID(op);
		this.opid2 = null;		
	}

	public QualName(OpOrID op) {
		extendsmark = false;
		this.opid1=new OpOrID(op);
		this.opid2 = null;		
	}

	public QualName(ID id) {
		extendsmark = false;
		this.opid1= new OpOrID(id);
		this.opid2 = null;		
	}

	@Override
	public String print() {
		String s;
		if (opid2==null && !extendsmark)
			s = opid1.print();
		else			
	       s = opid1.print()+(extendsmark ? " extends " : ":")+opid2.print();
		
		return s;
	}
		
	/**
	 * Parser of qualname. Grammar:<br>
	 * qualName : ID |  ID':'opOrID | opOrID extendsmark opOrID;<br>
     *varmark : 'var';<br>
     *extendsmark : 'extends';<br>
     *opOrID : op | ID;<br>
	 * @param ctx Parsing context.
	 * @return Representation
	 */
	public static QualName qualName(QualNameContext ctx) {
		QualName r = null;
		if (Parsing.hasTerminal(ctx.ID())) {
			ID id1 = ID.IDTerm(ctx.ID());
			OpOrID oid1 = new OpOrID(id1);				
			if (ctx.opOrID().size()==1) {
				OpOrID oid2 = OpOrID.opOrID(ctx.opOrID(0));				
				r = new QualName(oid1,oid2,false);
			} else
				r = new QualName(oid1);			
		} else if (ctx.opOrID().size()==2) {
				OpOrID oid1 = OpOrID.opOrID(ctx.opOrID(0));				
				OpOrID oid2 = OpOrID.opOrID(ctx.opOrID(1));				
				r = new QualName(oid1,oid2,true);
			}
			else
				Parsing.error("QualName, unexpected opOrID number: "+ctx.opOrID().size()+"("+ ctx.getText()+" )"); 	

		
		return r;
		
	}
	
	@Override
	public QualName clone() {
		QualName  r=null; 
		OpOrID opid1p =  opid1 == null ? null : opid1.clone();
		OpOrID opid2p =  opid2 == null ? null : opid2.clone(); 
		boolean extendsmarkp = extendsmark; 
		r = new QualName(opid1p,opid2p,extendsmarkp);
		return r;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (extendsmark ? 1231 : 1237);
		result = prime * result + ((opid1 == null) ? 0 : opid1.hashCode());
		result = prime * result + ((opid2 == null) ? 0 : opid2.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QualName other = (QualName) obj;
		if (extendsmark != other.extendsmark)
			return false;
		if (opid1 == null) {
			if (other.opid1 != null)
				return false;
		} else if (!opid1.equals(other.opid1))
			return false;
		if (opid2 == null) {
			if (other.opid2 != null)
				return false;
		} else if (!opid2.equals(other.opid2))
			return false;
		return true;
	}

};
