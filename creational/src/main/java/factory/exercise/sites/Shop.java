package factory.exercise.sites;

import factory.exercise.pages.CartPage;
import factory.exercise.pages.ItemPage;
import factory.exercise.pages.SearchPage;

public class Shop extends Website {

  @Override
  protected void createWebsite() {
    pages.add(new CartPage());
    pages.add(new ItemPage());
    pages.add(new SearchPage());
  }
}
