package cz.wrent.javaFunkytional;

import cz.wrent.javaFunkytional.HigherOrderFunctions.Kitchen;

public class KitchenImpl implements Kitchen {

  @Override
  public void prepare() {
    System.out.println("Preparing");
  }

  @Override
  public void boilWater() {
    System.out.println("Boiling");
  }

  @Override
  public void serve() {
    System.out.println("Serving");
  }

  @Override
  public void clean() {
    System.out.println("Cleaning");
  }
}
