package command;

public class CommandEverydayDemo {

  public static void main(String[] args) {
    Task task1 = new Task(10, 12);
    Task task2 = new Task(11, 13);

    Thread thread1 = new Thread(task1);
    thread1.run();

    Thread thread2 = new Thread(task2);
    thread2.run();
  }
}

class Task implements Runnable {
  private final int num1;
  private final int num2;

  Task(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  @Override
  public void run() { // execute method
    System.out.println(num1 * num2); //receiver
  }
}