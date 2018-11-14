package decorator;

import decorator.model.DressingDecorator;
import decorator.model.MeatDecorator;
import decorator.model.Sandwich;
import decorator.model.SimpleSandwich;

public class DecoratorSandwichDemo {

  public static void main(String[] args) {
    Sandwich sandwich = new DressingDecorator(
        new MeatDecorator(new SimpleSandwich()));

    System.out.println(sandwich.make());
  }
}
