package mediator.exercise;

import mediator.exercise.model.Light;
import mediator.exercise.model.Mediator;
import mediator.exercise.model.TurnOffAllLightsCommand;
import mediator.exercise.model.TurnOnAllLightsCommand;

public class MediatorDemo {
  public static void main(String[] args) {
    Mediator mediator = new Mediator();

    mediator.registerLight(new Light("Bedroom"));
    mediator.registerLight(new Light("Kitchen"));

    new TurnOnAllLightsCommand(mediator).execute();
    new TurnOffAllLightsCommand(mediator).execute();
  }
}
