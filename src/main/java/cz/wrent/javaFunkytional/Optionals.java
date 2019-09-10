package cz.wrent.javaFunkytional;

import java.util.Optional;

public class Optionals {

  public static void main(String[] args) {
    var optional = Optional.of("Hello");

    if (optional.isPresent()) {
      System.out.println(optional.get());
    }

    String result = optional.map(Optionals::transformString)
        .orElse(getDefault());

    System.out.println(result);
  }

  private static String transformString(String input) {
    System.out.println("transforming");
    return input.toUpperCase();
  }

  private static String getDefault() {
    System.out.println("getting default");
    return "DEFAULT";
  }
}
