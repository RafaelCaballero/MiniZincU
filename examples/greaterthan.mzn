int:N=1;
enum tree = { leaf(int), node(int, tree, tree)};
var tree(N):t;
var int:x;

predicate greaterThan(var tree:t, var int:r) = 
case t of
leaf(x) --> r>x;
node(o,t1,t2) --> r>o /\ greaterThan(t1,r) /\ greaterThan(t2,r);
endcase;

predicate maxVal(var tree:t, var int:r) =
case t of
leaf(x) --> r=x;
node(o,t1,t2) -->  let {var int:r1} in ( maxValr(t1,r1) /\
                   let {var int:r2} in (maxVal(t2,r2) /\
                    (r=max[r1,r2,o])));
endcase;


constraint maxVal(t,x);

solve satisfy;

output(["."]);

