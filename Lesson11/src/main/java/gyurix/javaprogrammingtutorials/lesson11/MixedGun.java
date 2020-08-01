package gyurix.javaprogrammingtutorials.lesson11;

public class MixedGun extends Weapon {
  public MixedGun() {
    super("MixedGun");
    damage=20;
  }

  @Override
  public Weapon merge(Weapon weapon) {
    throw new RuntimeException("Mixed gun can not be merged");
  }
}
