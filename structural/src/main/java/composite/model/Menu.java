package composite.model;

import java.util.Iterator;

public class Menu extends MenuComponent {

  public Menu(String name, String url) {
    super(name, url);
  }

  @Override
  public MenuComponent add(MenuComponent menuComponent) {
    menuComponents.add(menuComponent);
    return menuComponent;
  }

  @Override
  public MenuComponent remove(MenuComponent menuComponent) {
    menuComponents.remove(menuComponent);
    return menuComponent;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder(print(this));

    Iterator<MenuComponent> iterator = menuComponents.iterator();

    while (iterator.hasNext()) {
      builder.append(iterator.next());
    }

    return builder.toString();
  }
}
