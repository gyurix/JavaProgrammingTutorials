package gyurix.javaprogrammingtutorials.lesson8.a;

import gyurix.javaprogrammingtutorials.lesson8.FieldAccessTester;

public class AParent implements FieldAccessTester {
  public boolean publicFieldA;
  protected boolean protectedFieldA;
  boolean noModifierFieldA;
  private boolean privateFieldA;

  public void accessFields() {
    System.out.println("privateFieldA is " + privateFieldA);
    System.out.println("noModifierFieldA is " + noModifierFieldA);
    System.out.println("protectedFieldA is " + protectedFieldA);
    System.out.println("publicFieldA is " + publicFieldA);
  }

  void noModifierParentMethod() {
    System.out.println("No modifier parent method");
  }

  protected void protectedAParentMethod() {
    System.out.println("Protected a parent method");
  }
}
