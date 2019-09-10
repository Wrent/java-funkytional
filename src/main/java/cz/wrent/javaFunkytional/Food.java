package cz.wrent.javaFunkytional;

class Food {
  private final String name;
  private final Rating rating;
  private final String country;

  Food(String name, Rating rating) {
    this.name = name;
    this.rating = rating;
    this.country = null;
  }

  Food(String name, Rating rating, String country) {
    this.name = name;
    this.rating = rating;
    this.country = country;
  }

  String getName() {
    return name;
  }

  Rating getRating() {
    return rating;
  }

  String getCountry() {
    return country;
  }

  @Override
  public String toString() {
    return "Food{" +
        "name='" + name + '\'' +
        ", rating=" + rating +
        ", country='" + country + '\'' +
        '}';
  }
}
