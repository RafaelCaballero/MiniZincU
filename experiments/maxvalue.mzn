%
% maxvalue.mzn
% Rafael Caballero
% Compile:
% 1) java -jar minizincu.jar maxvalue.mzn > trans.mzn
% 2) mzn-g12lazy trans.mzn

% Note: mzn-g12lazy does not admit directly using int values; instead
% we must use a bounded range. The size of the range has no effect
% on the compile time  (in fact it can cover the MiniZinc default range
% (-1000000,1000000), but it affects the solving time
set of int: Int=-100..100;
int:N=7;
enum tree = { leaf(-100..100), node(-100..100, tree, tree)};
var tree(N):t;
var tree(N):s;
var Int:x;
var Int:y;

predicate contains(var tree:t, var Int:r) = 
case t of
leaf(o) --> r=o;
node(o,t1,t2) --> r=o \/ contains(t1,r) \/ contains(t2,r);
endcase;


predicate maxVal(var tree:t, var Int:r) =
case t of
leaf(o) --> r=o;
node(o,t1,t2) -->  let {var Int:r1} in ( maxVal(t1,r1) /\
                   let {var Int:r2} in (maxVal(t2,r2) /\
                    (r=max([r1,r2,o]))));
endcase;


constraint forall(i in 0..N)(contains(t,i) /\ contains(s,i));
constraint maxVal(t,x);
constraint maxVal(s,y);
constraint x<y;

solve minimize y;

output(["t: ",show(t), "\ns: ",show(s)]);


