package gyurix.javaprogrammingtutorials.lesson9;

import javafx.geometry.Point2D;

public interface MovableObject extends Container {
  @Override
  default boolean contains(double x, double y) {
    double minX = getMinX();
    double maxX = getMaxX();
    double minY = getMinY();
    double maxY = getMaxY();
    return x >= minX && x <= maxX && y >= minY && y <= maxY;
  }

  default double dist(double x, double y) {
    return Math.sqrt((getCenterX() - x) * (getCenterX() - x) +
            (getCenterY() - y) * (getCenterY() - y));
  }

  default Point2D getCenter() {
    return new Point2D(getCenterX(), getCenterY());
  }

  double getCenterX();

  double getCenterY();

  default double getMaxX() {
    return getCenterX() + getRadiusX();
  }

  default double getMaxY() {
    return getCenterY() + getRadiusY();
  }

  default double getMinX() {
    return getCenterX() - getRadiusX();
  }

  default double getMinY() {
    return getCenterY() - getRadiusY();
  }

  default Point2D getRadius() {
    return new Point2D(getRadiusX(), getRadiusY());
  }

  double getRadiusX();

  double getRadiusY();

  void move(double x, double y);
  /*
  default String toString(){
    return "";
  }*/
}
