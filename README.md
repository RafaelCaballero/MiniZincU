MiniZincU
=========

Extensions of the Contraint modelling language MiniZinc. This library is a source to source transformer for MiniZinc models. It allows extend MiniZinc using union types, and uses a program transformation to produce a valid MiniZinc model with the same semantics. Check this [paper](http://gpd.sip.ucm.es/rafa/papers/ppdp13.pdf) for details. This is a joint work with Peter Stuckey and Antonio Tenorio-Fornés.

## Requirements
- Java 8 or higher
- MiniZinc 2.0 or higher

## Using MiniZincU
In order to try the code you can have a look to the examples folder of the repository. The transformation is 
- Download the [jar file](https://github.com/RafaelCaballero/MiniZincU/raw/master/minizincu.jar)
- Suppose you wish to try the model contained in arith.mzn. Then type:
  * java -jar minizincu.jar arith.mzn > aritht.mzn
  * minizinc aritht.mzn

## Limitations
- Declared parameter (constants) are still not working inside union types.
- Case statements are only allowed inside predicates/functions
- Predicate arguments that correspond to case variables in the predicate body can be only either variables or constants
