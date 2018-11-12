package abstractFactory.factory;

import abstractFactory.card.CardType;
import abstractFactory.card.CreditCard;
import abstractFactory.card.visa.VisaBlackCreditCard;
import abstractFactory.card.visa.VisaGoldCreditCard;
import abstractFactory.validator.Validator;
import abstractFactory.validator.visa.VisaValidator;

public class VisaFactory extends CreditCardFactory {

  @Override
  public CreditCard getCreditCard(CardType cardType) {
    switch (cardType) {
      case GOLD:
        return new VisaGoldCreditCard();
      case PLATINUM:
        return new VisaBlackCreditCard();
    }

    return null;
  }

  public Validator getValidator(CardType CardType) {
    return new VisaValidator();
  }
}
