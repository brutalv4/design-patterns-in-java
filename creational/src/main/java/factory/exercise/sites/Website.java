package factory.exercise.sites;

import factory.exercise.pages.Page;
import java.util.ArrayList;
import java.util.List;

public abstract class Website {

  protected List<Page> pages = new ArrayList<>();

  public List<Page> getPages() {
    return pages;
  }

  Website() {
    createWebsite();
  }

  protected abstract void createWebsite();
}
