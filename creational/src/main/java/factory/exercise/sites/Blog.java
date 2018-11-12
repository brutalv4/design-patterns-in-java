package factory.exercise.sites;

import factory.exercise.pages.AboutPage;
import factory.exercise.pages.CommentPage;
import factory.exercise.pages.ContactPage;
import factory.exercise.pages.PostPage;

public class Blog extends Website {

  @Override
  protected void createWebsite() {
    pages.add(new PostPage());
    pages.add(new AboutPage());
    pages.add(new CommentPage());
    pages.add(new ContactPage());
  }
}
