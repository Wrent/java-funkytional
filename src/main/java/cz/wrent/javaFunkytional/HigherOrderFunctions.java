package cz.wrent.javaFunkytional;

import java.util.function.Consumer;

public class HigherOrderFunctions {

  public static void main(String[] args) {
    HigherOrderFunctions higherOrderFunctions = new HigherOrderFunctions();
    higherOrderFunctions.cookPasta(new KitchenImpl(), new Food("Spaghetti", Rating.EXCEPTIONAL));
    higherOrderFunctions.cookSteak(new KitchenImpl(), new Food("Steak", Rating.EXCEPTIONAL));
  }

  void cookPasta(Kitchen kitchen, Food food) {
    kitchen.prepare();
    kitchen.boilWater();
    System.out.println("cooking pasta " + food.getName());
    kitchen.serve();
    kitchen.clean();
  }

  void cookSteak(Kitchen kitchen, Food food) {
    kitchen.prepare();
    kitchen.boilWater();
    System.out.println("cooking steak " + food.getName());
    kitchen.serve();
    kitchen.clean();
  }

  interface Kitchen {

    void prepare();

    void boilWater();

    void serve();

    void clean();
  }
}
