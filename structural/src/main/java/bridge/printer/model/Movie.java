package bridge.printer.model;

public class Movie {

  private final String classification;
  private final String runtime;
  private final String title;
  private final String year;

  public Movie(String classification, String runtime, String title, String year) {
    this.classification = classification;
    this.runtime = runtime;
    this.title = title;
    this.year = year;
  }

  public String getClassification() {
    return classification;
  }

  public String getRuntime() {
    return runtime;
  }

  public String getTitle() {
    return title;
  }

  public String getYear() {
    return year;
  }
}
