package singleton;

public class SingletonEveryDemo {

  public static void main(String[] args) {
    Runtime singletonRuntime = Runtime.getRuntime();

    singletonRuntime.gc();

    System.out.println(singletonRuntime);

    Runtime anotherRuntime = Runtime.getRuntime();

    System.out.println(anotherRuntime);

    if (singletonRuntime == anotherRuntime) {
      System.out.println("They are the same instances!");
    }

  }
}
