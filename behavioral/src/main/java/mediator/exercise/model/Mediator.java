package mediator.exercise.model;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

  private List<Light> lights = new ArrayList<>();

  public void registerLight(Light light) {
    lights.add(light);
  }

  void turnOnAllLights() {
    for (Light light : lights) {
      if (!light.isOn()) {
        light.toggle();
      }
    }
  }

  void turnOffAllLights() {
    for (Light light : lights) {
      if (light.isOn()) {
        light.toggle();
      }
    }
  }
}
