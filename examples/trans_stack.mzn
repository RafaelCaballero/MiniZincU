% MiniZinc Model parsed using Antlr4
% Rafael Caballero 2015/01/12 11:25:092014



% 
% Data definitions: 
% enum stack= {empty,s(int,stack)}
% ------------------ 

% Extensions Section
extended int3 = [negInf]++int++[negInf];

% Declarations Section
var 1..2:a;
var int:a_2_1;
var 1..2:a_2_2;
var int:a_2_2_2_1;
var 1..2:a_2_2_2_2;
var int:a_2_2_2_2_2_1;
var 1..2:a_2_2_2_2_2_2;
var bool:a_b;
var bool:a_2_2_b;
var bool:a_2_2_2_2_b;
var bool:a_2_2_2_2_2_2_b;
var 1..2:b;
var int:b_2_1;
var 1..2:b_2_2;
var int:b_2_2_2_1;
var 1..2:b_2_2_2_2;
var int:b_2_2_2_2_2_1;
var 1..2:b_2_2_2_2_2_2;
var bool:b_b;
var bool:b_2_2_b;
var bool:b_2_2_2_2_b;
var bool:b_2_2_2_2_2_2_b;

% Constraints Section
constraint (b = 2) /\ (b_2_1 = 3) /\ ((b_2_2 = a) /\ (b_2_2_2_1 = a_2_1) /\ (b_2_2_2_2 = a_2_2) /\ (b_2_2_2_2_2_1 = a_2_2_2_1) /\ (b_2_2_2_2_2_2 = a_2_2_2_2));
constraint ((b = 1) /\ (1 = 0)) \/ ((b = 2) /\ (let {var int:x2} in (((b_2_2 = 1) /\ (x2 = 0)) \/ ((b_2_2 = 2) /\ (let {var int:x2_2} in (((b_2_2_2_2 = 1) /\ (x2_2 = 0)) \/ ((b_2_2_2_2 = 2) /\ (let {var int:x2_3} in (((b_2_2_2_2_2_2 = 1) /\ (x2_3 = 0))) /\ (x2_2 = x2_3 + 1)))) /\ (x2 = x2_2 + 1)))) /\ (1 = x2 + 1)));
constraint a_2_2_2_2_2_2_b = (a_2_2_2_2_2_2 != 2);
constraint a_2_2_2_2_b = (((a_2_2_2_2 != 2 -> (a_2_2_2_2_2_1 = 0) /\ (a_2_2_2_2_2_2 = (1)))) /\ ((a_2_2_2_2 = 2 -> a_2_2_2_2_2_2_b)));
constraint a_2_2_b = (((a_2_2 != 2 -> (a_2_2_2_1 = 0) /\ ((a_2_2_2_2 = (1)) /\ (a_2_2_2_2_2_1 = 0) /\ (a_2_2_2_2_2_2 = (1))))) /\ ((a_2_2 = 2 -> a_2_2_2_2_b)));
constraint a_b = (((a != 2 -> (a_2_1 = 0) /\ ((a_2_2 = (1)) /\ (a_2_2_2_1 = 0) /\ (a_2_2_2_2 = (1)) /\ (a_2_2_2_2_2_1 = 0) /\ (a_2_2_2_2_2_2 = (1))))) /\ ((a = 2 -> a_2_2_b)));
constraint a_b;
constraint b_2_2_2_2_2_2_b = (b_2_2_2_2_2_2 != 2);
constraint b_2_2_2_2_b = (((b_2_2_2_2 != 2 -> (b_2_2_2_2_2_1 = 0) /\ (b_2_2_2_2_2_2 = (1)))) /\ ((b_2_2_2_2 = 2 -> b_2_2_2_2_2_2_b)));
constraint b_2_2_b = (((b_2_2 != 2 -> (b_2_2_2_1 = 0) /\ ((b_2_2_2_2 = (1)) /\ (b_2_2_2_2_2_1 = 0) /\ (b_2_2_2_2_2_2 = (1))))) /\ ((b_2_2 = 2 -> b_2_2_2_2_b)));
constraint b_b = (((b != 2 -> (b_2_1 = 0) /\ ((b_2_2 = (1)) /\ (b_2_2_2_1 = 0) /\ (b_2_2_2_2 = (1)) /\ (b_2_2_2_2_2_1 = 0) /\ (b_2_2_2_2_2_2 = (1))))) /\ ((b = 2 -> b_2_2_b)));
constraint b_b;

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
     if (fix(a_2_2) = 2) 
     then 
          "s" ++ "(" ++ show(a_2_2_2_1) ++ ", " ++ (if (fix(a_2_2_2_2) = 1) 
then 
     "empty"
else 
     if (fix(a_2_2_2_2) = 2) 
     then 
          "s" ++ "(" ++ show(a_2_2_2_2_2_1) ++ ", " ++ (if (fix(a_2_2_2_2_2_2) = 1) 
then 
     "empty"
else 
     ""
endif) ++ ")"
     else 
          ""
     endif
endif) ++ ")"
     else 
          ""
     endif
endif) ++ ")"
     else 
          ""
     endif
endif,"\n","b: ",if (fix(b) = 1) 
then 
     "empty"
else 
     if (fix(b) = 2) 
     then 
          "s" ++ "(" ++ show(b_2_1) ++ ", " ++ (if (fix(b_2_2) = 1) 
then 
     "empty"
else 
     if (fix(b_2_2) = 2) 
     then 
          "s" ++ "(" ++ show(b_2_2_2_1) ++ ", " ++ (if (fix(b_2_2_2_2) = 1) 
then 
     "empty"
else 
     if (fix(b_2_2_2_2) = 2) 
     then 
          "s" ++ "(" ++ show(b_2_2_2_2_2_1) ++ ", " ++ (if (fix(b_2_2_2_2_2_2) = 1) 
then 
     "empty"
else 
     ""
endif) ++ ")"
     else 
          ""
     endif
endif) ++ ")"
     else 
          ""
     endif
endif) ++ ")"
     else 
          ""
     endif
endif,"\n"]);


