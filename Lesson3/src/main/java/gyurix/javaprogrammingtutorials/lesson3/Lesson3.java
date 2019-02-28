package gyurix.javaprogrammingtutorials.lesson3;

import java.util.Scanner;

public class Lesson3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter numbers A and B: ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if (a < 5)
      System.out.println("A is smaller than 5");
    if (a > 6) {
      System.out.println("A is greater than 6");
      System.out.println("^^^^^^^^^^^^^^^^^^^^");
    }
    if (a <= b) {
      System.out.println("A is smaller or equals than B");
    }
    if (b <= a) {
      System.out.println("B is smaller or equals than A");
    }
    if (a == b) {
      System.out.println("A equals to B");
    }
    switch (a - 1) {
      case 5:
        System.out.println("A-1 is 5");
        break;
      case 6: {
        int c = 5;
        System.out.println("A-1 is 6 and C is " + c);
        break;
      }
      case 18: {
        int c = 4;
        System.out.println("A-1 is 18 and C is 4");
        break;
      }
      default: {
        System.out.println("A-1 is not 5, not 6 and not 18");
      }
    }

    if (a == 5 && b == 6 ){
      System.out.println("A=5 and B=6");
    }

    if (a == 5 || b == 6 ){
      System.out.println("A=5 or B=6");
    }
    else{
      System.out.println("A!=5 and B!=6");
    }

    if (a!=5 && b!=6){
      System.out.println("A!=5 and B!=6");
    }

    //Homework: Check if A is 100 times more than B, if it is, than print a smile to the console ☺☻
  }
}
