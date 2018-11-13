package bridge.shape.shape;

import bridge.shape.color.Color;

public abstract class Shape {

  final Color color;

  Shape(Color color) {
    this.color = color;
  }

  public abstract void applyColor();
}
