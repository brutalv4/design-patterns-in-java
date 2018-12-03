package templateMethod.model;

import lombok.Data;

@Data
public abstract class OrderTemplate {

  private boolean isGift;

  abstract void doCheckout();

  abstract void doPayment();

  abstract void doReceipt();

  abstract void doDelivery();

  private void wrapGift() {
    System.out.println("Gift was wrapped.");
  }

  public final void processOrder() {
    doCheckout();
    doPayment();
    if (isGift) {
      wrapGift();
    } else {
      doReceipt();
    }

    doDelivery();
  }
}
