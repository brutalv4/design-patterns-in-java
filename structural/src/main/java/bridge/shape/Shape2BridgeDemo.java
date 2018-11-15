package bridge.shape;

import bridge.shape.color.Blue;
import bridge.shape.color.Color;
import bridge.shape.color.Green;
import bridge.shape.color.Red;
import bridge.shape.shape.Circle;
import bridge.shape.shape.Shape;
import bridge.shape.shape.Square;

public class Shape2BridgeDemo {

  public static void main(String[] args) {

    Shape square = new Square(new Blue());

    Shape circle = new Circle(new Red());

    Color green = new Green();
    Shape greenCircle = new Circle(green);
    Square greenSquare = new Square(green);

    square.applyColor();
    circle.applyColor();
    greenCircle.applyColor();
    greenSquare.applyColor();
  }
}
