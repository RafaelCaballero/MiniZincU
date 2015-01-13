int:N=7;
int:level = 4;
set of int: S = {3,14,32};
enum op = {add , subst , multi , divi};

enum tree = { leaf(int), node(op, tree, tree)};

var tree(level):t;

predicate validTree(var tree:t, var set of int: S) =
   case t of
      leaf(x)       --> x in S;
      node(o,t1,t2) --> validTree(t1,S) /\ validTree(t2,S);
   endcase;

predicate value(var tree:t, var int:v) =
case t of
   leaf(x) --> v=x;
   node(o,t1,t2) --> let {var 0..1000:v1, var 0..1000:v2} in
                     (value(t1,v1) /\ value(t2,v2) /\
                     applyOp(op,v1,v2,v));
endcase;

predicate appOp(var o:op, var int:v1,var int:v2, var int:v)=

   case o of
      add --> v = v1+v2;
      subst --> v = v1-v2;
      multi --> v = v1*v2;
      divi --> v = v1 div v2 /\ v1 mod v2 = 0;
   endcase;

constraint validTree(t,S);
constraint value(t,N);

solve satisfy;
output([show(t)]);
