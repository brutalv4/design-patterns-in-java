package state.model;

import lombok.Data;

@Data
public class FanOffState extends State {

  private final Fan fan;

  @Override
  public void handleRequest() {
    System.out.println("Turning fan off to low.");
    fan.setState(fan.getFanLowState());
  }

  @Override
  public String toString() {
    return "Fan is off.";
  }
}

