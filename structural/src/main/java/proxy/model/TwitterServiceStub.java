package proxy.model;

public class TwitterServiceStub implements TwitterService {

  @Override
  public String getTimeline(String screenName) {
    return "My neato timeline";
  }

  @Override
  public void postToTimeline(String screenName, String message) {
    System.out.println(String.format("%s: %s", screenName, message));
  }
}
