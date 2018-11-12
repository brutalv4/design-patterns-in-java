package abstractFactory.validator.amex;

import abstractFactory.validator.Validator;
import abstractFactory.card.CreditCard;

public class AmexGoldValidator implements Validator {

  @Override
  public boolean isValid(CreditCard creditCard) {
    return false;
  }
}
