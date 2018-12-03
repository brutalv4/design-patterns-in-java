package observer.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

  private List<Observer> observers = new ArrayList<>();

  abstract void setState(String state);

  abstract String getState();

  void attach(Observer observer) {
    observers.add(observer);
  }

  public void detach(Observer observer) {
    observers.remove(observer);
  }

  void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }
}

