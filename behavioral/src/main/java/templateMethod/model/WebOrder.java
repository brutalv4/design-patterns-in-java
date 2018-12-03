package templateMethod.model;

public class WebOrder extends OrderTemplate {

  @Override
  void doCheckout() {
    System.out.println("Get items from cart,");
    System.out.println("Set gift preferences,");
    System.out.println("Set delivery address,");
    System.out.println("Set billing address.");
  }

  @Override
  void doPayment() {
    System.out.println("Process payment without Card present");
  }

  @Override
  void doReceipt() {
    System.out.println("Email receipt");
  }

  @Override
  void doDelivery() {
    System.out.println("Ship the item to address");
  }
}
