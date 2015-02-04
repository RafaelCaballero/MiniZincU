


int:N=9 ;

%extended int2 = [negInf]++int++[posInf];
enum stack  = { empty, s(int,stack) };
var stack(N):a;
var stack(N):b;
var int:la;
var int:lb;


% t = push x on s
predicate push(var int:x, var stack:s, var stack: t) = 
 t = s(x,s);

predicate length(var stack:s, var int: x) =
case s of 
 empty --> x=0;
 s(n,s2) --> let {var int:x2} in  length(s2,x2) /\ x=x2+1;
endcase;

constraint length(a,la);
constraint length(b,lb);
constraint la>0 /\ la<lb;

solve satisfy;

output(["a: ",show(a),"\n",
        "b: ",show(b),"\n"
       ]);
