
enum op = {sum , minus , prod , div};
enum tree  = { leaf(2..3), node(op, tree, tree) };
var tree(2):t;

%redicate positive(var tree:s) =
%case s of
%leaf(x) --> x>0;
%node(o,s1,s2) --> positive(s1) /\ positive(s2);
%endcase;

%constraint positive(t);
%constraint t != node(sum,leaf(2),leaf(3));
output(["t: ",show(t),"\n"]);
