package singleton.exercise;

class DbSingleton {

  private static DbSingleton instance = new DbSingleton();

  private DbSingleton() {
  }

  static DbSingleton getInstance() {
    return instance;
  }

}

