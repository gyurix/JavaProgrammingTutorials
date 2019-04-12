package gyurix.javaprogrammingtutorials.lesson8;

import gyurix.javaprogrammingtutorials.lesson8.a.AChild;
import gyurix.javaprogrammingtutorials.lesson8.a.AParent;
import gyurix.javaprogrammingtutorials.lesson8.b.BChild;
import gyurix.javaprogrammingtutorials.lesson8.b.BParent;

public class Lesson8 {
  public static void main(String[] args) {
    FieldAccessTester fieldAccessTesters[] = new FieldAccessTester[]{new AParent(), new AChild(), new BParent(), new BChild()};
    for (FieldAccessTester t : fieldAccessTesters) {
      System.out.println("Testing " + t.getClass().getSimpleName() + " (" + t.getClass().getName() + ")...");
      t.accessFields();
    }
    // Homework: Make a C class, having 3 public methods, extending the AParent and add this C class to these fieldAccessTesters array
    System.out.println("End of program");
  }
}
