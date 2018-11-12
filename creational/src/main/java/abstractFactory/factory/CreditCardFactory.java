package abstractFactory.factory;

import abstractFactory.card.CardType;
import abstractFactory.card.CreditCard;
import abstractFactory.validator.Validator;

public abstract class CreditCardFactory {

  public static CreditCardFactory getCreditCardFactory(int creditScore) {

    if (creditScore > 650) {
      return new AmexFactory();
    } else {
      return new VisaFactory();
    }
  }

  public abstract CreditCard getCreditCard(CardType cardType);

  public abstract Validator getValidator(CardType cardType);
}
