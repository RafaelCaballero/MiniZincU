



extended int3 = [negInf]++int++[undef,posInf];
enum stack  = { empty, s(int3,stack) };
var stack(3):a;
var stack(3):b;
%var int:x;

% t = push x on s
predicate push(var int:x, var stack:s, var stack: t) = 
 t = s(x,s);

predicate length(var stack:s, var int: x) =
case s of 
 empty --> x=0;
 s(n,s2) --> let {var int:x2} in  length(s2,x2) /\ x=x2+1;
endcase;

constraint push(3,a,b);
%constraint top(x,b);
%constraint a==s(1,b);
constraint length(b,1);
%constraint b==s(0,empty);

solve satisfy;

output(["a: ",show(a),"\n",
        "b: ",show(b),"\n"
 %       "x: ",show(x)
       ]);
