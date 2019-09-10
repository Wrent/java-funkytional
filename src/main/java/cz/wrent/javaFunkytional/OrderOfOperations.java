package cz.wrent.javaFunkytional;

import java.util.List;
import java.util.stream.Collectors;

public class OrderOfOperations {

  public static void main(String[] args) {
    var meals = List.of(
        new Food("Sushi", Rating.GREAT, "Japan"),
        new Food("Spaghetti", Rating.EXCEPTIONAL, "Italy"),
        new Food("Lasagna", Rating.AVERAGE, "Italy"),
        new Food("Bratwurst", Rating.BAD, "Germany"),
        new Food("Hamburger", Rating.GOOD, "USA"),
        new Food("Surf & turf", Rating.EXCEPTIONAL, "USA")
    );

    List<String> countries = getThreeMealCountries(meals);
    System.out.println(countries);

//    IntStream.iterate(0, i -> (i + 1) % 2)
//        .distinct()
//        .limit(10)
//        .forEach(System.out::println);
  }

  private static List<String> getThreeMealCountries(List<Food> meals) {
    return meals.stream()
        .distinct()
        .limit(3)
        .map(Food::getCountry)
        .collect(Collectors.toList());
  }
}
