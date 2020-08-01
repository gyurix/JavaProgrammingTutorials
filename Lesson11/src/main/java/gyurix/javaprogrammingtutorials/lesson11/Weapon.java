package gyurix.javaprogrammingtutorials.lesson11;

public abstract class Weapon {
  protected double damage;
  private String name;

  public Weapon(String name) {
    this.name = name;
  }

  public double getDamage() {
    return damage;
  }

  public abstract Weapon merge(Weapon weapon);

  @Override
  public String toString() {
    return name+" - "+damage;
  }
}
