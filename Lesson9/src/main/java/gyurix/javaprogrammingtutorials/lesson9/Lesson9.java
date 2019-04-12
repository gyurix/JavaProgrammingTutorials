package gyurix.javaprogrammingtutorials.lesson9;

import javafx.geometry.Point2D;

public class Lesson9 {
  public static void main(String[] args) {
    Circle circle = new Circle(1, 2, 3);
    Cube cube = new Cube(4, 5, 3);
    Rectangle rectangle = new Rectangle(1, 1, 1, 2);
    PointContainer points = new PointContainer(new Point2D(1, 1),
            new Point2D(2, 2));
    System.out.println(circle);
    System.out.println(cube);
    System.out.println(rectangle);
    System.out.println(points);

    for (double x = -1; x <= 1; ++x) {
      for (double y = -1; y <= 1; ++y) {
        System.out.println("\n==== " + x + "; " + y + " ====");
        System.out.println("Circle: " + circle.contains(x, y));
        System.out.println("Cube: " + cube.contains(x, y));
        System.out.println("Rectangle: " + rectangle.contains(x, y));
        System.out.println("Points: " + points.contains(x, y));
      }
    }
  }
}
