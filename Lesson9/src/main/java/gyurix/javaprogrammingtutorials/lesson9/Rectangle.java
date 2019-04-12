package gyurix.javaprogrammingtutorials.lesson9;

public class Rectangle implements MovableObject {
  private double radiusX;
  private double radiusY;
  private double x;
  private double y;

  public Rectangle(double x, double y, double radiusX, double radiusY) {
    this.x = x;
    this.y = y;
    this.radiusX = radiusX;
    this.radiusY = radiusY;
  }

  @Override
  public double getCenterX() {
    return x;
  }

  @Override
  public double getCenterY() {
    return y;
  }

  @Override
  public double getRadiusX() {
    return radiusX;
  }

  @Override
  public double getRadiusY() {
    return radiusY;
  }

  @Override
  public void move(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "Rectangle (" + x + ";" + y + "; r = " + radiusX + ";" + radiusY + ")";
  }
}
