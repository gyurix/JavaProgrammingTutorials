package gyurix.javaprogrammingtutorials.lesson4;

public class XY {
  private int x;
  private int y;

  public XY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public double average() {
    return sum() / 2.0;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = Math.max(0, x);
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = Math.max(0, y);
  }

  @Override
  public int hashCode() {
    return x * 17 + y;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof XY))
      return false;
    XY xy = (XY) obj;
    return xy.x == x && xy.y == y;
  }

  @Override
  public String toString() {
    return x + " " + y;
  }

  public int sum() {
    return x + y;
  }
}
