package state.model;

import lombok.Data;

@Data
public class FanMediumState extends State {

  private final Fan fan;

  @Override
  public void handleRequest() {
    System.out.println("Turning fan medium to high.");
    fan.setState(fan.getFanHighState());
  }

  @Override
  public String toString() {
    return "Fan is medium.";
  }
}
