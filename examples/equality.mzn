%
% equality.mzn
% Rafael Caballero
% Compile:
% 1) java -jar minizincu.jar equality.mzn > trans.mzn
% 2) minizinc trans.mzn or minizinc -a trans.mzn to obtain all the solutions

enum op = {add ,subst , mult , divi};
enum tree = { leaf(int),  node(op, tree, tree) };
var tree(2):t;
var tree(3):s;
%constraint node(add, node(subst, leaf(6), leaf(8)), t) = s;
constraint node(add,leaf(0),t)=s;

solve satisfy;

output(["t: ", show(t), "\ns: ", show(s)]);