package gyurix.javaprogrammingtutorials.lesson2;

import java.util.Scanner;

public class Lesson2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter numbers A and B: ");
    // A = 7 is looking like that written with binary numbers 0000000 00000000 00000000 00000111
    // B = 5 is looking like that written with binary numbers 0000000 00000000 00000000 00000101
    // A | B = 111 OR 101 = 111 => 7
    // A ^ B = 111 XOR 101 = 010 => 2
    // A & B = 111 AND 101 = 101 => 5
    // ~A = NOT 0000000 00000000 00000000 00000111 = 11111111 11111111 11111111 11111000 = -8
    // ~B = NOT 0000000 00000000 00000000 00000101 = 11111111 11111111 11111111 11111010 = -6
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println("Arithmetical operations:");
    System.out.println("A + B = " + (a + b));
    System.out.println("A - B = " + (a - b));
    System.out.println("A * B = " + (a * b));
    System.out.println("A / B = " + (a / b));
    System.out.println("A % B = " + (a % b));
    System.out.println("Logical operations:");
    System.out.println("A | B = " + (a | b));
    System.out.println("A ^ B = " + (a ^ b));
    System.out.println("A & B = " + (a & b));
    System.out.println("~A = " + (~a));
    System.out.println("~B = " + (~b));
  }
}
