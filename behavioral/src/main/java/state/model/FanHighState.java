package state.model;

import lombok.Data;

@Data
public class FanHighState extends State {

  private final Fan fan;

  @Override
  public void handleRequest() {
    System.out.println("Turning fan off...");
    fan.setState(fan.getFanOffState());
  }

  @Override
  public String toString() {
    return "Fan is high.";
  }
}
