package abstractFactory.factory;

import abstractFactory.card.CardType;
import abstractFactory.card.CreditCard;
import abstractFactory.card.amex.AmexGoldCreditCard;
import abstractFactory.card.amex.AmexPlatinumCreditCard;
import abstractFactory.validator.Validator;
import abstractFactory.validator.amex.AmexGoldValidator;
import abstractFactory.validator.amex.AmexPlatinumValidator;

public class AmexFactory extends CreditCardFactory {

  @Override
  public CreditCard getCreditCard(CardType cardType) {
    switch (cardType) {
      case GOLD:
        return new AmexGoldCreditCard();
      case PLATINUM:
        return new AmexPlatinumCreditCard();
    }
    return null;
  }

  @Override
  public Validator getValidator(CardType cardType) {
    switch (cardType) {
      case GOLD:
        return new AmexGoldValidator();
      case PLATINUM:
        return new AmexPlatinumValidator();
    }
    return null;
  }
}
