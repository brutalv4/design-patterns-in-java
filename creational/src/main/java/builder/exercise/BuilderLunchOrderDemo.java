package builder.exercise;

public class BuilderLunchOrderDemo {

  public static void main(String[] args) {

    LunchOrder lunchOrder = new LunchOrder.Builder()
        .bread("Wheat")
        .condiments("Lettuce")
        .dressing("Mayo")
        .meat("Turkey")
        .build();

    System.out.println(lunchOrder);
  }
}
