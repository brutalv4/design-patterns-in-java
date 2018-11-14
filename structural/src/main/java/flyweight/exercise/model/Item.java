package flyweight.exercise.model;

//Instances of Item will be the Flyweights
public class Item {

  private final String name;

  Item(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}

