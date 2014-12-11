% MiniZinc Model parsed using Antlr4
% Rafael Caballero, 2014



% 
% Data definitions: 
% enum op= {sum,minus,prod,divi}
% enum tree= {leaf(2..2),node(op,tree,tree)}
% ------------------ 

% Declarations Section
var 1..2:t;
var 2..2:t_1_1;
var 1..4:t_2_1;
var 1..2:t_2_2;
var 2..2:t_2_2_1_1;
var 1..4:t_2_2_2_1;
var 1..2:t_2_2_2_2;
var 1..2:t_2_2_2_3;
var 1..2:t_2_3;
var 2..2:t_2_3_1_1;
var 1..4:t_2_3_2_1;
var 1..2:t_2_3_2_2;
var 1..2:t_2_3_2_3;
var bool:t_b;
var bool:t_2_2_b;
var bool:t_2_2_2_2_b;
var bool:t_2_2_2_3_b;
var bool:t_2_3_b;
var bool:t_2_3_2_2_b;
var bool:t_2_3_2_3_b;

% Constraints Section
constraint (t = 1 -> t_1_1 > 0) /\ (t = 2 -> (t_2_2 = 1 -> t_2_2_1_1 > 0) /\ (t_2_2 = 2 -> true /\ true /\ true /\ true) /\ (t_2_3 = 1 -> t_2_3_1_1 > 0) /\ (t_2_3 = 2 -> true /\ true /\ true /\ true));
constraint t_2_2_2_2_b = (t_2_2_2_2 != 1 /\ t_2_2_2_2 != 2);
constraint t_2_2_2_3_b = (t_2_2_2_3 != 1 /\ t_2_2_2_3 != 2);
constraint t_2_2_b = ((t_2_2 != 1 -> t_2_2_1_1 = 2) /\ (t_2_2 != 2 -> t_2_2_2_1 = 1 /\ t_2_2_2_2 = 1 /\ t_2_2_2_3 = 1) /\ (t_2_2 = 2 -> t_2_2_2_2_b /\ t_2_2_2_3_b));
constraint t_2_3_2_2_b = (t_2_3_2_2 != 1 /\ t_2_3_2_2 != 2);
constraint t_2_3_2_3_b = (t_2_3_2_3 != 1 /\ t_2_3_2_3 != 2);
constraint t_2_3_b = ((t_2_3 != 1 -> t_2_3_1_1 = 2) /\ (t_2_3 != 2 -> t_2_3_2_1 = 1 /\ t_2_3_2_2 = 1 /\ t_2_3_2_3 = 1) /\ (t_2_3 = 2 -> t_2_3_2_2_b /\ t_2_3_2_3_b));
constraint t_b = ((t != 1 -> t_1_1 = 2) /\ (t != 2 -> t_2_1 = 1 /\ t_2_2 = 1 /\ t_2_2_1_1 = 2 /\ t_2_2_2_1 = 1 /\ t_2_2_2_2 = 1 /\ t_2_2_2_3 = 1 /\ t_2_3 = 1 /\ t_2_3_1_1 = 2 /\ t_2_3_2_1 = 1 /\ t_2_3_2_2 = 1 /\ t_2_3_2_3 = 1) /\ (t = 2 -> t_2_2_b /\ t_2_3_b));
constraint t_b;

% Solve Section
solve  satisfy;

% Output Section
output(["t: ",if (fix(t) = 1) 
then 
     "leaf" ++ "(" ++ show(t_1_1) ++ ")"
else 
     if (fix(t) = 2) 
     then 
          "node" ++ "(" ++ if (fix(t_2_1) = 1) 
then 
     "sum"
else 
     if (fix(t_2_1) = 2) 
     then 
          "minus"
     else 
          if (fix(t_2_1) = 3) 
          then 
               "prod"
          else 
               if (fix(t_2_1) = 4) 
               then 
                    "divi"
               else 
                    ""
               endif
          endif
     endif
endif ++ ", " ++ if (fix(t_2_2) = 1) 
then 
     "leaf" ++ "(" ++ show(t_2_2_1_1) ++ ")"
else 
     if (fix(t_2_2) = 2) 
     then 
          "node" ++ "(" ++ if (fix(t_2_2_2_1) = 1) 
then 
     "sum"
else 
     if (fix(t_2_2_2_1) = 2) 
     then 
          "minus"
     else 
          if (fix(t_2_2_2_1) = 3) 
          then 
               "prod"
          else 
               if (fix(t_2_2_2_1) = 4) 
               then 
                    "divi"
               else 
                    ""
               endif
          endif
     endif
endif ++ ", " ++ ")"
     else 
          ""
     endif
endif ++ ", " ++ if (fix(t_2_3) = 1) 
then 
     "leaf" ++ "(" ++ show(t_2_3_1_1) ++ ")"
else 
     if (fix(t_2_3) = 2) 
     then 
          "node" ++ "(" ++ if (fix(t_2_3_2_1) = 1) 
then 
     "sum"
else 
     if (fix(t_2_3_2_1) = 2) 
     then 
          "minus"
     else 
          if (fix(t_2_3_2_1) = 3) 
          then 
               "prod"
          else 
               if (fix(t_2_3_2_1) = 4) 
               then 
                    "divi"
               else 
                    ""
               endif
          endif
     endif
endif ++ ", " ++ ")"
     else 
          ""
     endif
endif ++ ")"
     else 
          ""
     endif
endif,"\n"]);


