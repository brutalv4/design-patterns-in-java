package interpreter.exercise;

import interpreter.exercise.model.AndExpression;
import interpreter.exercise.model.Expression;
import interpreter.exercise.model.OrExpression;
import interpreter.exercise.model.TerminalExpression;

public class InterpreterDemo {

  private static Expression buildInterpreterTree() {
    TerminalExpression lions = new TerminalExpression("Lions");
    TerminalExpression tigers = new TerminalExpression("Tigers");
    TerminalExpression bears = new TerminalExpression("Bears");

    // Tigers and Bears
    AndExpression tigersAndBears = new AndExpression(tigers, bears);

    // Lions or (Tiger and Bears)
    OrExpression lionsOrTigersAndBears = new OrExpression(lions, tigersAndBears);

    return new AndExpression(bears, lionsOrTigersAndBears);
  }

  /**
   * main method - build the interpreter and then interpret a specific
   * sequence
   *
   * @param args cmd args
   */
  public static void main(String[] args) {
//    String context = "Lions";
//    String context = "Tigers";
//    String context = "Bears";
//    String context = "Lions Tiger";
//    String context = "Lions Bears";
    String context = "Tigers Bears";

    Expression define = buildInterpreterTree();

    System.out.println(context + " is " + define.interpret(context));
  }
}
