package cz.wrent.javaFunkytional;

public class HigherOrderFunctions {

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
