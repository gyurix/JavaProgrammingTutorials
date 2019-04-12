package gyurix.javaprogrammingtutorials.lesson7;

public class Lesson7 {
  public static void main(String[] args) throws InterruptedException {
    Game game = new Game();
    /*game.init();
    while (game.isRunning()) {
      game.tick();
      Thread.sleep(500);
    }

    game.init();
    do {
      game.tick();
      Thread.sleep(500);
    } while (game.isRunning());*/

    int i = 0;
    while (i < 20) {
      System.out.println(i++);
    }

    i = 0;
    do {
      System.out.println(i++);
    } while (i < 20);

    while (true) {
      System.out.println("Looping...");
      if (game.rand.nextInt(5) == 3)
        break;
    }

    System.out.println("Starting do-while");
    do {
      System.out.println("Looping...");
      if (game.rand.nextInt(5) == 3)
        break;
    } while (true);
  }
}
