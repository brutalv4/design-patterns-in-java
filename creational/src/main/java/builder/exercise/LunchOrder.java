package builder.exercise;

public class LunchOrder {

  static class Builder {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    Builder() {
    }

    LunchOrder build() {
      return new LunchOrder(this);
    }

    Builder bread(String bread) {
      this.bread = bread;
      return this;
    }

    Builder condiments(String condiments) {
      this.condiments = condiments;
      return this;
    }

    Builder dressing(String dressing) {
      this.dressing = dressing;
      return this;
    }

    Builder meat(String meat) {
      this.meat = meat;
      return this;
    }
  }

  private final String bread;
  private final String condiments;
  private final String dressing;
  private final String meat;

  private LunchOrder(Builder builder) {
    bread = builder.bread;
    condiments = builder.condiments;
    dressing = builder.dressing;
    meat = builder.meat;
  }

  public String getBread() {
    return bread;
  }

  public String getCondiments() {
    return condiments;
  }

  public String getDressing() {
    return dressing;
  }

  public String getMeat() {
    return meat;
  }

  @Override
  public String toString() {
    return "LunchOrder{" +
        "bread='" + bread + '\'' +
        ", condiments='" + condiments + '\'' +
        ", dressing='" + dressing + '\'' +
        ", meat='" + meat + '\'' +
        '}';
  }
}
