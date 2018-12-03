package visitor;

import visitor.model.AtvPartsDisplayVisitor;
import visitor.model.Fender;
import visitor.model.Oil;
import visitor.model.PartsOrder;
import visitor.model.Wheel;

public class VisitorDemo {

  public static void main(String[] args) {
    PartsOrder order = new PartsOrder();
    order.addPart(new Wheel());
    order.addPart(new Fender());
    order.addPart(new Oil());

    order.accept(new AtvPartsShippingVisitor());
    System.out.println("\nListing order:");
    order.accept(new AtvPartsDisplayVisitor());
  }
}
