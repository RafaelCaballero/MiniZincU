% 
% A fully-complete tree.
%
% Rafael Caballero, 2015
%
% Compile:
% java -jar minizincu.jar treecomplete.mzn > trans.mzn
% minizinc  trans.mzn


int:N=9;
enum tree = { leaf(int), node(int, tree, tree)};
var tree(N):t;

predicate compl(var tree:t, var int:l) =
case t of
leaf(x) --> l=1;
node(o,t1,t2) --> l>0 /\ compl(t1,l-1) /\ compl(t2,l-1);
endcase;

constraint compl(t,N);
solve satisfy;
output([show(t)]);