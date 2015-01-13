% MiniZinc Model parsed using Antlr4
% Rafael Caballero 2015/01/13 12:18:132014



% 
% Data definitions: 
% enum stack= {empty,s(int3,stack)}
% ------------------ 

% Extensions Section
extended int3 = [negInf]++int++[negInf];

% Declarations Section
var 1..2:a;
var int3:a_2_1;
var 1..2:a_2_2;
var bool:a_b;
var bool:a_2_2_b;

% Constraints Section
constraint a_2_2_b = (a_2_2 != 2);
constraint a_b = (((a != 2 -> (a_2_1 = negInf) /\ (a_2_2 = (1)))) /\ ((a = 2 -> a_2_2_b)));
constraint a_b;

% Solve Section
solve  satisfy;

% Output Section
output(["a: ",if (fix(a) = 1) 
then 
     "empty"
else 
     if (fix(a) = 2) 
     then 
          "s" ++ "(" ++ show(a_2_1) ++ ", " ++ (if (fix(a_2_2) = 1) 
then 
     "empty"
else 
     ""
endif) ++ ")"
     else 
          ""
     endif
endif,"\n"]);


