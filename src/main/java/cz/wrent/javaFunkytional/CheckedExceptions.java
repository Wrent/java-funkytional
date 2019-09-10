package cz.wrent.javaFunkytional;

import java.util.List;
import java.util.stream.Collectors;

public class CheckedExceptions {

  public static void main(String[] args) {
    List<String> list = List.of("Hello")
        .stream()
        .map(str -> {
          try {
            return transform(str);
          } catch (MyException e) {
            throw new RuntimeException(e);
          }
        })
        .collect(Collectors.toList());

    List.of("Hello", "Bye", "235652325413")
        .stream()
        .map(Either.lift(CheckedExceptions::transform))
        .filter(Either::isLeft)
        .map(Either::getLeft)
        .forEach(exception -> exception.ifPresent(CheckedExceptions::handleException));
  }

  private static String transform(String input) throws MyException {
    if (input.length() > 6) {
      throw new MyException();
    }
    return input;
  }

  private static void handleException(Exception exception) {
    System.out.println("handling");
  }

  private static class MyException extends Exception {

  }
}
