package observer.model;

public class TabletClient extends Observer {


  public TabletClient(Subject subject) {
    super(subject);
    subject.attach(this);
  }

  public void addMessage(String message) {
    subject.setState(message + " - sent from tablet");
  }

  @Override
  void update() {
    System.out.println("Tablet Stream: " + subject.getState());
  }
}
