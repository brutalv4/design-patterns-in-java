package templateMethod.model;

public class StoreOrder extends OrderTemplate {


  @Override
  void doCheckout() {
    System.out.println("Ring up items from cart.");
  }

  @Override
  void doPayment() {
    System.out.println("Process payment with Card present");
  }

  @Override
  void doReceipt() {
    System.out.println("Print receipt");
  }

  @Override
  void doDelivery() {
    System.out.println("Bag items at counter");
  }
}
