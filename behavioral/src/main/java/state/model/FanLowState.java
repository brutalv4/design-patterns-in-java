package state.model;

import lombok.Data;

@Data
public class FanLowState extends State {

  private final Fan fan;

  @Override
  public void handleRequest() {
    System.out.println("Turning fan low to medium.");
    fan.setState(fan.getFanMediumState());
  }

  @Override
  public String toString() {
    return "Fan is low.";
  }
}
