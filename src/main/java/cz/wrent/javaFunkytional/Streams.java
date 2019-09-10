package cz.wrent.javaFunkytional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

  public static void main(String[] args) {
    var stream = List
        .of(new Food("Spaghetti", Rating.GREAT), new Food("Burger", Rating.EXCEPTIONAL))
        .stream();

    stream.forEach(System.out::println);

    Set<Food> collectedFood = stream.collect(Collectors.toSet());
  }
}
