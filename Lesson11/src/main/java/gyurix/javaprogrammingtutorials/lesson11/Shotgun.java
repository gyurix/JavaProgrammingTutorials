package gyurix.javaprogrammingtutorials.lesson11;

public class Shotgun extends Weapon {
  public Shotgun() {
    super("Shotgun");
    damage=15;
  }

  @Override
  public Weapon merge(Weapon weapon) {
    throw new RuntimeException("Shotgun can not be merged");
  }
}
