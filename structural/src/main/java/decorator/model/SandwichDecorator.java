package decorator.model;

public abstract class SandwichDecorator implements Sandwich {

  final Sandwich customSandwich;

  SandwichDecorator(Sandwich customSandwich) {
    this.customSandwich = customSandwich;
  }

  @Override
  public String make() {
    return customSandwich.make();
  }
}
