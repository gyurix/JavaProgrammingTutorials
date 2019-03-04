package gyurix.javaprogrammingtutorials.lesson4;

import java.util.Scanner;

public class Lesson4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    XY xy = new XY(scanner.nextInt(), scanner.nextInt());
    System.out.println("XY is " + xy);
    System.out.println("XY sum is " + xy.sum());
    System.out.println("XY average is " + xy.average());
  }
}
