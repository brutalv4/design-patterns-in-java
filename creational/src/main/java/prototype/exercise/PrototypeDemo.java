package prototype.exercise;

public class PrototypeDemo {

  public static void main(String[] args) {
    Registry registry = new Registry();
    Movie movie = (Movie) registry.createItem("Movie");
    movie.setTitle("Creational Patterns in Java");

    System.out.printf("%s - %s\n", movie, movie.getTitle());

    Movie anotherMovie = (Movie) registry.createItem("Movie");
    anotherMovie.setTitle("Gang of Four");

    System.out.printf("%s - %s\n", anotherMovie, anotherMovie.getTitle());
  }
}
