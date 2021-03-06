package singleton.exercise;

class DbSingleton {

  private static DbSingleton instance;

  private DbSingleton() {
  }

  static DbSingleton getInstance() {
    if (instance == null) {
      synchronized (DbSingleton.class) {
        if (instance == null) {
          instance = new DbSingleton();
        }
      }
    }
    return instance;
  }

}

