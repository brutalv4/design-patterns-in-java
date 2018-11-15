package bridge.printer.printer;

import bridge.printer.model.Detail;
import bridge.printer.model.Movie;
import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

  private final Movie movie;

  public MoviePrinter(Movie movie) {
    this.movie = movie;
  }

  @Override
  protected List<Detail> getDetails() {
    ArrayList<Detail> details = new ArrayList<>();

    details.add(new Detail("Title", movie.getTitle()));
    details.add(new Detail("Year", movie.getYear()));
    details.add(new Detail("Runtime", movie.getRuntime()));

    return details;
  }

  @Override
  protected String getHeader() {
    return movie.getClassification();
  }
}
