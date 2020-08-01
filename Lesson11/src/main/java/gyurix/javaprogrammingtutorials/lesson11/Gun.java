package gyurix.javaprogrammingtutorials.lesson11;

public class Gun extends Weapon {
  public Gun() {
    super("Gun");
    damage = 10;
  }

  @Override
  public Weapon merge(Weapon weapon) {
    if (weapon instanceof Shotgun)
      return new MixedGun();
    throw new RuntimeException("Gun can not be merged with "+weapon.getClass().getSimpleName());
  }
}
