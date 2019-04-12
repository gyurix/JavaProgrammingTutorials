package gyurix.javaprogrammingtutorials.lesson9;

public class Cube implements MovableObject {
  private double radius;
  private double x;
  private double y;

  public Cube(double x, double y, double radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
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
    return radius;
  }

  @Override
  public double getRadiusY() {
    return radius;
  }

  @Override
  public void move(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "Cube (" + x + ";" + y + "; r = " + radius + ")";
  }
}
