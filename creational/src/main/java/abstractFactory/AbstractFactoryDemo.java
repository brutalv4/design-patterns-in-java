package abstractFactory;

import abstractFactory.card.CardType;
import abstractFactory.card.CreditCard;
import abstractFactory.factory.CreditCardFactory;

public class AbstractFactoryDemo {

  public static void main(String[] args) {
    CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(755);

    CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

    System.out.println(card.getClass());

    abstractFactory = CreditCardFactory.getCreditCardFactory(600);

    CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);

    System.out.println(card2.getClass());
  }
}
