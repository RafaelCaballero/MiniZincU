MiniZincU
=========

Extensions of the Contraint modelling language MiniZinc. This library is a source to source transformer for MiniZinc models. It allows extend MiniZinc using union types.


# Requirements
- Java 8 or higher
- MiniZinc 2.0 or higher

# Limitations
- Declared parameter (constants) are still not working inside union types.
- Case statements are only allowed inside predicates/functions
- Predicate arguments that correspond to case variables in the predicate body can be only either variables or constants
