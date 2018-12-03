package command.exercise;

import command.exercise.model.AllLightsOffCommand;
import command.exercise.model.Command;
import command.exercise.model.Light;
import command.exercise.model.ToggleCommand;
import command.exercise.model.Switch;
import java.util.ArrayList;
import java.util.List;

//client
public class CommandDemo {

  public static void main(String[] args) {
    Light bedroomLight = new Light("bedroom");
    Light kitchenLight = new Light("kitchen");

    Switch lightSwitch = new Switch();

    Command toggleCommand1 = new ToggleCommand(bedroomLight);
    Command toggleCommand2 = new ToggleCommand(kitchenLight);

    lightSwitch.storeAndExecute(toggleCommand1);
    lightSwitch.storeAndExecute(toggleCommand2);

    List<Light> lights = new ArrayList<>();
    lights.add(bedroomLight);
    lights.add(kitchenLight);

    AllLightsOffCommand allLightsOffCommand = new AllLightsOffCommand(lights);
    lightSwitch.storeAndExecute(allLightsOffCommand);
  }
}
