package factory.exercise;

import factory.exercise.sites.Blog;
import factory.exercise.sites.Shop;
import factory.exercise.sites.Website;
import factory.exercise.sites.WebsiteType;

class WebsiteFactory {

  static Website getWebsite(WebsiteType siteType) {
    switch (siteType) {
      case BLOG: {
        return new Blog();
      }
      case SHOP: {
        return new Shop();
      }
      default: {
        return null;
      }
    }
  }

}
