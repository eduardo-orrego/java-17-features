package org.duna.jep406;

class Figure {
  String name;
  double perimeter;

  Figure(String name, double perimeter) {
    this.name = name;
    this.perimeter = perimeter;
  }
}

public class NewSwitchExpressionsDemo01 {

  record Person(String name, int age) {
  }

  public static void main(String[] args) {
    String result1 = checkObject(new Person("Edward", 38));
    System.out.println(result1);
    String result2 = checkObject(new Figure("Circle", 100.00));
    System.out.println(result2);
  }

  public static String checkObject(Object obj) {
    return switch (obj) {
      case Person person -> "Name: %s, age: %s".formatted(person.name(), person.age());
      case Figure figure -> "Name: %s, perimeter: %s".formatted(figure.name, figure.perimeter);
      case null -> "It is null";
      default -> "It is an object";
    };
  }
}
