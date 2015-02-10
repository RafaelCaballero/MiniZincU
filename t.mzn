% MiniZinc Model parsed using Antlr4
% Rafael Caballero 2015/01/30 18:23:442014



% 
% var tree(1):t transformed into 5 vars + 3 bvars + 3 ctrs
% Data definitions: 
% enum nodeval= {a}
% enum tree= {leaf(nodeval),node(nodeval,tree,tree)}
% ------------------ 

% Declarations Section
var 1..2:t;
var 1..1:t_1_1;
var 1..1:t_2_1;
var 1..2:t_2_2;
var 1..2:t_2_3;
var bool:t_b;
var bool:t_2_2_b;
var bool:t_2_3_b;

% Constraints Section
constraint (t = 1) /\ (1 = 1);
constraint t_2_2_b = ((t_2_2 != 1) /\ (t_2_2 != 2));
constraint t_2_3_b = ((t_2_3 != 1) /\ (t_2_3 != 2));
constraint t_b = (((t != 1 -> t_1_1 = (1))) /\ (((t != 2 -> (t_2_1 = (1)) /\ (t_2_2 = (1)) /\ (t_2_3 = (1)))) /\ ((t = 2 -> t_2_2_b /\ t_2_3_b))));
constraint t_b;

% Solve Section
solve  satisfy;

% Output Section
output([""]);


