package proxy;

import proxy.model.SecurityProxy;
import proxy.model.TwitterService;
import proxy.model.TwitterServiceStub;

public class SecurityProxyDemo {

  public static void main(String[] args) {
    TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
    System.out.println(service.getTimeline("dscbsdc"));
    service.postToTimeline("tweeterScreenName", "Some post message");
  }
}
