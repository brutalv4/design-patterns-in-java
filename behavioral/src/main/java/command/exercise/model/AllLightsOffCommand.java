package command.exercise.model;

import java.util.List;

public class AllLightsOffCommand implements Command {

  private final List<Light> lights;

  public AllLightsOffCommand(List<Light> lights) {
    this.lights = lights;
  }

  @Override
  public void execute() {
    System.out.println("-- Macro lights off command executed.");
    for (Light light : lights) {
      if (light.isOn()) {
        light.toggle();
      }
    }
  }
}
