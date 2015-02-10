enum op = {add ,subst , mult , divi};
enum tree = { leaf(0..1),  node(op, tree, tree) };
var tree(2):t;
var tree(3):s;
constraint node(add, node(subst, leaf(0), leaf(1)), t) = s;
%constraint node(add,leaf(0),t)=s;

solve satisfy;

output(["t: ", show(t), "\ns: ", show(s)]);