package abstractFactory.validator.amex;

import abstractFactory.validator.Validator;
import abstractFactory.card.CreditCard;

public class AmexPlatinumValidator implements Validator {

  @Override
  public boolean isValid(CreditCard creditCard) {
    return false;
  }
}
