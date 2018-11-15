package facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DbSingleton {

  private static DbSingleton instance;
  private static final String CONNECTION_URL = "jdbc:derby:memory:memdatabase;create=true";

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


  Connection getConnection() throws SQLException {
    return DriverManager.getConnection(CONNECTION_URL);
  }
}