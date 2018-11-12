package abstractFactory.validator.visa;

import abstractFactory.card.CreditCard;
import abstractFactory.validator.Validator;

public class VisaValidator implements Validator {

  @Override
  public boolean isValid(CreditCard creditCard) {
    return false;
  }
}
