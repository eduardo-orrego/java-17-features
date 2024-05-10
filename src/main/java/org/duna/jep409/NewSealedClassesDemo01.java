package org.duna.jep409;

public class NewSealedClassesDemo01 {
  public static void main(String[] args) {
    Shape circle = new Circle(1);
    double rotateShape = rotate(circle);
    System.out.println(rotateShape);
  }

  static double rotate(Shape shape) {
    if (shape instanceof Circle) return shape.calculateArea();
    else if (shape instanceof Rectangle) return shape.calculateArea();
    else if (shape instanceof Square) return shape.calculateArea();
    else return 1.00;
  }
}
abstract sealed class Shape permits Circle, Rectangle, Square {
  // Define common methods and attributes for all forms.
  public abstract double calculateArea();
}

//A permitted subclass may be declared final to prevent its part of the class hierarchy from being extended further.
final class Circle extends Shape {
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}

//A permitted subclass may be declared sealed to allow its part of the hierarchy to be extended further
//than envisaged by its sealed superclass, but in a restricted fashion.
sealed class Rectangle extends Shape permits TransparentRectangle, FilledRectangle {
  private final double width;
  private final double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return width * height;
  }
}

final class TransparentRectangle extends Rectangle {
  public TransparentRectangle(double width, double height) {
    super(width, height);
  }
}

final class FilledRectangle extends Rectangle {
  public FilledRectangle(double width, double height) {
    super(width, height);
  }
}

//A permitted subclass may be declared non-sealed so that its part of the hierarchy reverts to being open
//for extension by unknown subclasses. (A sealed class cannot prevent its permitted subclasses from doing this.)
non-sealed class Square extends Shape {
  private final double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double calculateArea() {
    return side * side;
  }
}
