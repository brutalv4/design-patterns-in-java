package command.exercise.model;

//invoker
public class Switch {

  public void storeAndExecute(Command command) {
    command.execute();
  }
}
