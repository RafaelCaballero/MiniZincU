extended bEx = bool ++ [undef];
extended bExEx = bEx ++ [null];
enum stack = {empty, stack(bExEx,stack)};
int:n;
array[1..n]   of var bEx: x;
array[1..n]   of var bEx: y;
array[1..n+1] of var bEx: s;
array[1..n+1] of var bEx: c;

function var bEx:xor(var bEx:a, var bEx:b) =   
  let{var bEx:r, var bool:c1=sv([a,b]),        
      constraint (c1 /\ (r = a xor b)) 
                 \/ (not c1 /\ r=undef)
  } in r;             

function var bEx:/\(var bEx:a, var bEx:b) =
 let{var bEx:r, var bool:c1=sv([a,b]),
     var bool:c2= (a=false \/ b=false),
     constraint (c1 /\ r = a /\ b) \/
                (not c1 /\ c2 /\ r=false) \/
                (not c1 /\ not c2 /\ r= undef)
     } in r;

function var bEx:\/(var bEx:a, var bEx:b) =
 let{var bEx:r, var bool:c1=sv([a,b]),
     var bool:c2= (a=true \/ b=true),
     constraint (c1 /\ r = a \/ b) \/
                (not c1 /\ c2 /\ r=true) \/
                (not c1 /\ not c2 /\ r=undef)
     } in r;

constraint c[1]=false /\ s[n+1]=c[n+1];
constraint forall([s[i]=x[i] bEx:xor y[i] bEx:xor
               c[i]|i in 1..n]);
constraint forall([c[i+1]=(x[i] bEx:/\ y[i]) bEx:\/              
             ((x[i] bEx:xor y[i]) bEx:/\ c[i])
                   | i in 1..n]); 
solve satisfy;
