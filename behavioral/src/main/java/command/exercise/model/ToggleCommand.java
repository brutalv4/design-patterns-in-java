package command.exercise.model;

//concrete command
public class ToggleCommand implements Command {

  private final Light light;

  public ToggleCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    System.out.println("-- Toggle command executed.");
    light.toggle();
  }
}
