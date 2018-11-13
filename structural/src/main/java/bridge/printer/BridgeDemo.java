package bridge.printer;

import bridge.printer.formatter.HtmlFormatter;
import bridge.printer.formatter.PrintFormatter;
import bridge.printer.model.Movie;
import bridge.printer.printer.MoviePrinter;
import bridge.printer.printer.Printer;

public class BridgeDemo {

  public static void main(String[] args) {
    Movie johnWick = new Movie("Action", "2:15", "John Wick", "2014");

    Printer moviePrinter = new MoviePrinter(johnWick);

    String printedMaterial = moviePrinter.print(new PrintFormatter());
    String htmlMaterial = moviePrinter.print(new HtmlFormatter());

    System.out.println(printedMaterial);
    System.out.println(htmlMaterial);
  }
}
