package iterator;

import iterator.model.BikeRepository;
import java.util.Iterator;

public class IteratorDemo {

  public static void main(String[] args) {
    BikeRepository repo = new BikeRepository();

    repo.addBike("Cervelo");
    repo.addBike("Scott");
    repo.addBike("Fuji");

    Iterator<String> bikeIterator = repo.iterator();

    // classic iterator
    while (bikeIterator.hasNext()) {
      System.out.println(bikeIterator.next());
    }

    // foreach
    for (String bike: repo) {
      System.out.println(bike);
    }
  }
}
