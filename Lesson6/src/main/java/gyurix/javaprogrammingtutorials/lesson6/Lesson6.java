package gyurix.javaprogrammingtutorials.lesson6;

import java.util.Random;

public class Lesson6 {
  public static Random rand = new Random();

  public static boolean condition(int i) {
    System.out.println("Condition - " + i);
    return i > 5;
  }

  public static int initializer() {
    System.out.println("Initializer");
    return rand.nextInt(20);
  }

  public static void main(String[] args) throws InterruptedException {
    System.out.println("For loop start");
    for (int i = initializer(); condition(i); i = post_operation(i)) {
      System.out.println("Method body (i = " + i + ")");
    }
    System.out.println("For loop end");

    System.out.println("Most common use case - count from 0 to 19");
    for (int i = 0; i < 20; ++i)
      System.out.println("i = " + i);

    System.out.println("Counting backwards - from 19 to 0");
    for (int i = 19; i > -1; --i)
      System.out.println(i);

    System.out.println("Counting with bigger step - all the pair numbers between 0 and 20");
    for (int i = 0; i <= 20; i += 2)
      System.out.println(i);

    System.out.println("Initializer is not needed");
    int i = 0;
    for (; i < 20; i += 6)
      System.out.println(i);

    for (i = 0; ; i += 10) {
      if (i == 10) {
        System.out.println("I is 10, skipping the rest of the cycle");
        continue;
      }
      System.out.println("I is " + i);
      if (i == 50) {
        System.out.println("I is 50, exiting the for loop");
        break;
      }
    }

    System.out.println("Skip the post operation");
    for (int j = 0; j < 5; ) {
      System.out.println(j);
      ++j;
    }

    System.out.println("Infinite loop");
    for (; ; ) {
      System.out.println("This is looping forever...");
      Thread.sleep(1000);
    }
  }

  public static int post_operation(int i) {
    System.out.println("Post operation - " + i);
    return i - 1;
  }
}
