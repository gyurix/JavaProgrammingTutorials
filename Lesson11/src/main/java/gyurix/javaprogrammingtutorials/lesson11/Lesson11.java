package gyurix.javaprogrammingtutorials.lesson11;

public class Lesson11 {
  public static void main(String[] args) {
    Weapon[] weapons = new Weapon[]{new Gun(), new Shotgun(), new MixedGun()};
    for (Weapon w1 : weapons) {
      for (Weapon w2 : weapons) {
        System.out.println("Merging " + w1 + " with " + w2 + "...");
        try {
          Weapon w = w1.merge(w2);
          System.out.println("Result - " + w);
        } catch (RuntimeException e) {
          System.out.println("Failed - " + e.getMessage());
        }
        System.out.println("--------------------------------");
      }
      System.out.println("\n\n\n");
    }
  }
}
