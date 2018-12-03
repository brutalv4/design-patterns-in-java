package strategy;

import strategy.model.AmexStrategy;
import strategy.model.CreditCard;
import strategy.model.VisaStrategy;

public class StrategyDemo {

  public static void main(String[] args) {
    CreditCard amexCard =
        CreditCard.builder()
            .strategy(new AmexStrategy())
            .number("379185883464283")
            .date("04/2020")
            .cvv("123")
            .build();

    System.out.println("Is Amex valid: " + amexCard.isValid());

    CreditCard amexCard1 =
        CreditCard.builder()
            .strategy(new AmexStrategy())
            .number("379185883464282")
            .date("04/2027")
            .cvv("234")
            .build();

    System.out.println("Is Amex valid: " + amexCard1.isValid());

    CreditCard visaCard =
        CreditCard.builder()
            .strategy(new VisaStrategy())
            .number("4539589763663402")
            .date("05/2018")
            .cvv("324")
            .build();

    System.out.println("Is Visa valid: " + visaCard.isValid());
  }
}
