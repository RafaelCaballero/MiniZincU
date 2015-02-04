
int:N=3;
enum nat = {zero ,s(nat)};


predicate lessThanOrEqualTo(var nat:a, var nat: b) =
case a of 
 zero --> true;
 s(a2)--> (case b of 
           zero --> false;
           s(b2)--> lessThanOrEqualTo(a2,b2);
           endcase);
endcase;

var nat(N):t;
var nat(N):s;

constraint lessThanOrEqualTo(t,s);

solve satisfy;

 output(["t<=s with \nt: ",show(t),"\n", 
         "s: ",show(s),"\n"]);
%utput([".."]);


