package bridge.shape.shape;

import bridge.shape.color.Color;

public class Circle extends Shape {

  public Circle(Color color) {
    super(color);
  }

  @Override
  public void applyColor() {
    color.applyColor();
  }
}
