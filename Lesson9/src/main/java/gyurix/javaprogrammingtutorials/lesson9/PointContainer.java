package gyurix.javaprogrammingtutorials.lesson9;

import javafx.geometry.Point2D;

import java.util.Arrays;

public class PointContainer implements Container {
  private Point2D[] points;

  public PointContainer(Point2D... points) {
    this.points = points;
  }

  @Override
  public boolean contains(double x, double y) {
    for (Point2D p : points)
      if (p.getX() == x && p.getY() == y)
        return true;

    return false;
  }

  @Override
  public String toString() {
    return Arrays.toString(points);
  }
}
