package cz.wrent.javaFunkytional;

import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {

  public static void main(String[] args) {
    List<Food> exceptional = rateAllPastaDishesAsExceptional();
    System.out.println(exceptional);
  }

  private static List<Food> rateAllPastaDishesAsExceptional() {
    var dishes = List.of(
        new Food("Spaghetti", Rating.BAD),
        new Food("Burger", Rating.BAD),
        new Food("Ravioli", Rating.GOOD),
        new Food("Lasagna", Rating.GREAT)
    );

    return dishes.stream()
        .map(food -> {
          switch (food.getName()) {
            case "Spaghetti":
            case "Lasagna":
            case "Ravioli":
              return new Food(food.getName(), Rating.EXCEPTIONAL);
            default:
              return food;
          }
        })
        .collect(Collectors.toList());
  }
}
