package facade;

import facade.model.Address;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class JdbcFacade {

  private DbSingleton instance;

  JdbcFacade() {
    instance = DbSingleton.getInstance();
  }

  int createTable() {
    int count = 0;

    try (Connection connection = instance.getConnection();
        Statement statement = connection.createStatement()) {
      count = statement
          .executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return count;
  }

  int insertIntoTable() {
    int count = 0;

    try (Connection connection = instance.getConnection();
        Statement statement = connection.createStatement()) {
      count = statement
          .executeUpdate("INSERT INTO Address (ID, StreetName, City) VALUES (1, '1234 Some Street', 'Layton')");
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return count;
  }

  List<Address> getAdsresses() {
    List<Address> addresses = new ArrayList<>();

    try (Connection connection = instance.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT ID,StreetName,City FROM Address")) {
      while (rs.next()) {
        addresses.add(
            new Address(rs.getString(1), rs.getString(2), rs.getString(3)));
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return addresses;
  }

}
