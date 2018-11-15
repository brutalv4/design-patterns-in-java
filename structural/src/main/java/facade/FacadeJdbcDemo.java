package facade;

import facade.model.Address;
import java.util.List;

public class FacadeJdbcDemo {

  public static void main(String[] args) {
    JdbcFacade jdbcFacade = new JdbcFacade();

    jdbcFacade.createTable();

    System.out.println("Table created.");

    jdbcFacade.insertIntoTable();

    System.out.println("Record inserted.");

    List<Address> adsresses = jdbcFacade.getAdsresses();

    for (Address adsress : adsresses) {
      System.out.println(
          String.format(
              "{id=%s,  StreetName=%s, City=%s}", adsress.getId(), adsress.getCity(), adsress.getStreetName()));
    }
  }
}
