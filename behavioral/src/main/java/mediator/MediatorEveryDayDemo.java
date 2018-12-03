package mediator;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorEveryDayDemo {

  private Timer timer;

  private MediatorEveryDayDemo(int seconds) {
    timer = new Timer();
    timer.schedule(new RemindTask(), seconds * 1000);
    timer.schedule(new RemindTaskWithoutBeep(), 2 * seconds * 1000);
  }

  class RemindTask extends TimerTask {

    @Override
    public void run() {
      System.out.println("Time's up! Beeeep!");
    }
  }

  class RemindTaskWithoutBeep extends TimerTask {

    @Override
    public void run() {
      System.out.println("Now Time's really up! Nobeeeps!");
    }
  }


  public static void main(String[] args) {
    System.out.println("About to schedule task.");
    new MediatorEveryDayDemo(3);
    System.out.println("Task scheduled.");
  }
}
