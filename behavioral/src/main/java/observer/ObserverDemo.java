package observer;

import observer.model.MessageStream;
import observer.model.PhoneClient;
import observer.model.Subject;
import observer.model.TabletClient;

public class ObserverDemo {

  public static void main(String[] args) {
    Subject subject = new MessageStream();

    PhoneClient phoneClient = new PhoneClient(subject);
    TabletClient tabletClient = new TabletClient(subject);

    phoneClient.addMessage("Here is a new message!");
    tabletClient.addMessage("Another message!");
  }
}
