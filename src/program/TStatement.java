package program;

/**
 * 
 * @author rafa
 * Categories of statements allowed in a MiniZinc model
 *
 */
public enum TStatement {
  DATA, EXTENDED, CONSTRAINT, VARDECL, PARDECL, SOLVE, OUTPUT, PREDICATE, FUNCTION, INCLUDE, INIT
}