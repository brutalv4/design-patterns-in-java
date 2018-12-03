package strategy.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreditCard {

  private String number;
  private String date;
  private String cvv;
  private ValidationStrategy strategy;

  public boolean isValid() {
    return strategy.isValid(this);
  }
}

