package mediator.exercise.model;

//receiver
public class Light {

  private final String name;

  private boolean isOn = false;

  public Light(String name) {
    this.name = name;
  }

  void toggle() {
    if (isOn) {
      off();
    } else {
      on();
    }
    isOn = !isOn;
  }

  private void on() {
    System.out.println(name + ": light switched on.");
  }

  private void off() {
    System.out.println(name + ": light switched off.");
  }

  boolean isOn() {
    return isOn;
  }
}
