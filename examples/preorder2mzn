int:N=6;
enum tree = { leaf(int), node(int, tree, tree)};
var tree(N):t;

predicate root(var tree:t, var int:r) = 
case t of
leaf(x) --> r=x;
node(o,t1,t2) --> r=o;
endcase;

predicate preorder(var tree:t) =
case t of
leaf(x) --> true;
node(o,t1,t2) -->  let {var int:r1} in ( root(t1,r1) /\
                   let {var int:r2} in (root(t2,r2) /\
                    o<r1 /\ o>r2 /\  preorder(t1) /\ preorder(t2)));
endcase;


constraint preorder(t);

solve satisfy;

output(["."]);

