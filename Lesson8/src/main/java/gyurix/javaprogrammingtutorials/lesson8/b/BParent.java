package gyurix.javaprogrammingtutorials.lesson8.b;

import gyurix.javaprogrammingtutorials.lesson8.a.AParent;

public class BParent extends AParent {
  public boolean publicFieldB;
  protected boolean protectedFieldB;
  boolean noModifierFieldB;
  private boolean privateFieldB;

  @Override
  public void accessFields() {
    AParent aParent = new AParent();
    // aChild.privateAChildMethod();
    // Private methods can only be accessed from the class, where they were declared
    protectedAParentMethod();
    // Protected methods can not be called on another object only at itself and they can be overrided by subclasses
    // noModifierParentMethod();
    // No modifier methods can only be accessed and overridden from the same package
    // aChild.noModifierAChildMethod();
    // No access modifier methods can only be accessed from the same package

    //System.out.println("privateFieldA is " + privateFieldA);
    // Private fields can only be accessed from the same class, where they were declared
    //System.out.println("noModifierFieldA is " + noModifierFieldA);
    // No modifier fields can only be accessed from the same package, where they were declared
    System.out.println("protectedFieldA is " + protectedFieldA);
    System.out.println("publicFieldA is " + publicFieldA);
    System.out.println("privateFieldB is " + privateFieldB);
    System.out.println("noModifierFieldB is " + noModifierFieldB);
    System.out.println("protectedFieldB is " + protectedFieldB);
    System.out.println("publicFieldB is " + publicFieldB);
  }
}
