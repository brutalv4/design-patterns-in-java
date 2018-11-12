package abstractFactory.validator;

import abstractFactory.card.CreditCard;

public interface Validator {

  boolean isValid(CreditCard creditCard);
}
