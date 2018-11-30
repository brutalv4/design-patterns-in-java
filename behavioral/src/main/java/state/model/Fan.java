package state.model;

import lombok.Data;

@Data
public class Fan {

  final State fanOffState;
  final State fanLowState;
  final State fanMediumState;
  final State fanHighState;

  State state;

  public Fan() {
    fanOffState = new FanOffState(this);
    fanLowState = new FanLowState(this);
    fanMediumState = new FanMediumState(this);
    fanHighState = new FanHighState(this);

    state = fanOffState;
  }

  public void pullChain() {
    state.handleRequest();
  }

  @Override
  public String toString() {
    return state.toString();
  }
}
