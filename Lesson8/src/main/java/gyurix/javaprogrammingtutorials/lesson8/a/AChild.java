package gyurix.javaprogrammingtutorials.lesson8.a;

public class AChild extends AParent {
  public boolean publicFieldAChild;
  protected boolean protectedFieldAChild;
  boolean noModifierFieldAChild;
  private boolean privateFieldAChild;

  @Override
  public void accessFields() {
    //System.out.println("privateFieldA is " + privateFieldA);
    // Private fields can only be accessed from the same class where they were declared
    System.out.println("noModifierFieldA is " + noModifierFieldA);
    System.out.println("protectedFieldA is " + protectedFieldA);
    System.out.println("publicFieldA is " + publicFieldA);
    System.out.println("privateFieldAChild is " + privateFieldAChild);
    System.out.println("noModifierFieldAChild is " + noModifierFieldAChild);
    System.out.println("protectedFieldAChild is " + protectedFieldAChild);
    System.out.println("publicFieldAChild is " + publicFieldAChild);
    privateAChildMethod();
  }

  void noModifierAChildMethod() {
    System.out.println("Called no modifier AChildMethod");
  }

  private void privateAChildMethod() {
    System.out.println("Called private AChildMethod");
  }

  protected void protectedAChildMethod() {
    System.out.println("Called protected AChildMethod");
  }

  public void publicAChildMethod() {
    System.out.println("Called public AChildMethod");
  }
}
