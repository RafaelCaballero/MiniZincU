int:N=3;
enum tree = { leaf(int), node(int, tree, tree)};
var tree(N):t;
var tree(N):s;
var int:x;

predicate contains(var tree:t, var int:r) = 
case t of
leaf(o) --> r=o;
node(o,t1,t2) --> r=o \/ contains(t1,r) \/ contains(t2,r);
endcase;


predicate greaterThan(var tree:t, var int:r) = 
case t of
leaf(o) --> r<o;
node(o,t1,t2) --> r<o /\ greaterThan(t1,r) /\ greaterThan(t2,r);
endcase;

predicate maxVal(var tree:t, var int:r) =
case t of
leaf(o) --> r=o;
node(o,t1,t2) -->  let {var int:r1} in ( maxVal(t1,r1) /\
                   let {var int:r2} in (maxVal(t2,r2) /\
                    (r=max([r1,r2,o]))));
endcase;


constraint forall(i in 0..N)(contains(t,i));
constraint maxVal(t,x);
constraint greaterThan(s,x);


solve satisfy;

output([show(t), show(s)]);

