package gyurix.javaprogrammingtutorials.lesson7;

import java.util.Random;

public class Game {
  public Random rand = new Random();
  private boolean running;

  public void init() {
    System.out.println("Initializing game...");
    running = true;
  }

  public boolean isRunning() {
    return running;
  }

  public void shutdown() {
    System.out.println("Shutting down the game...");
    running = false;
  }

  public void tick() {
    System.out.println("Game tick");
    if (rand.nextInt(20) == 0)
      shutdown();
  }
}
