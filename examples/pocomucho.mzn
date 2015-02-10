
var 1..9:p;
var 1..9:o;
var 1..9:c;
var 1..9:m;
var 1..9:u;
var 1..9:h;

var int: poco;
var int: mucho;


constraint poco = o +10*c+100*o+1000*p;
constraint mucho = o + 10*h + 100*c + 1000*u +10000*m;

constraint 15*poco = mucho;


solve satisfy;

output ([" P: ",show(p),
         " O: ", show(o), 
         " C: ", show(c),
          " M: ", show(m),
         " U: ",show(u)," H: ",show(h), " POCO: ",show(poco), " MUCHO: ",show(mucho)]);