package observer.model;

abstract class Observer {
  final Subject subject;

  Observer(Subject subject) {
    this.subject = subject;
  }

  abstract void update();
}
