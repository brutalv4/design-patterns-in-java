package facade.model;

public class Address {
  private final String id;
  private final String streetName;
  private final String city;

  public Address(String id, String streetName, String city) {
    this.id = id;
    this.streetName = streetName;
    this.city = city;
  }


  public String getId() {
    return id;
  }

  public String getStreetName() {
    return streetName;
  }

  public String getCity() {
    return city;
  }
}
