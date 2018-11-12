package factory.exercise;

import static factory.exercise.sites.WebsiteType.BLOG;
import static factory.exercise.sites.WebsiteType.SHOP;

import factory.exercise.sites.Website;

public class FactoryDemo {

  public static void main(String[] args) {
    Website blog = WebsiteFactory.getWebsite(BLOG);

    if (blog != null) {
      System.out.println(blog.getPages());
    }

    Website shop = WebsiteFactory.getWebsite(SHOP);

    if (shop != null) {
      System.out.println(shop.getPages());
    }
  }
}
