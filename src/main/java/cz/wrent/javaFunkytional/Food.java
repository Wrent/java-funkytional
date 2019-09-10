package cz.wrent.javaFunkytional;

class Food {
  private final String name;
  private final Rating rating;

  Food(String name, Rating rating) {
    this.name = name;
    this.rating = rating;
  }

  String getName() {
    return name;
  }

  Rating getRating() {
    return rating;
  }

  @Override
  public String toString() {
    return "Food{" +
        "name='" + name + '\'' +
        ", rating=" + rating +
        '}';
  }
}
