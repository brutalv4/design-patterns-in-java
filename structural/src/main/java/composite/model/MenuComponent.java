package composite.model;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

  private final String name;
  private final String url;

  List<MenuComponent> menuComponents = new ArrayList<>();

  MenuComponent(String name, String url) {
    this.name = name;
    this.url = url;
  }

  public String getName() {
    return name;
  }

  public String getUrl() {
    return url;
  }

  public MenuComponent add(MenuComponent menuComponent) {
    throw new UnsupportedOperationException("Feature not implemented at this level");
  }


  public MenuComponent remove(MenuComponent menuComponent) {
    throw new UnsupportedOperationException("Feature not implemented at this level");
  }

  public abstract String toString();

  String print(MenuComponent menuComponent) {
    return new StringBuilder(name)
        .append(": ")
        .append(url)
        .append("\n")
        .toString();
  }

}
