package gyurix.javaprogrammingtutorials.lesson8.b;

import gyurix.javaprogrammingtutorials.lesson8.FieldAccessTester;
import gyurix.javaprogrammingtutorials.lesson8.a.AChild;
import gyurix.javaprogrammingtutorials.lesson8.a.AParent;

public class BChild implements FieldAccessTester {
  @Override
  public void accessFields() {
    AChild aChild=new AChild();
    // aChild.privateAChildMethod();
    // Private methods can only be accessed from the class, where they were declared
    // aChild.protectedAChildMethod();
    // Protected methods can only be accessed from the same package and by classes extending the class where they were declared
    // aChild.noModifierAChildMethod();
    // No access modifier methods can only be accessed from the same package

    aChild.publicAChildMethod();


    AParent aParent=new AParent();
    BParent bParent=new BParent();
    // System.out.println("privateFieldA is " + aParent.privateFieldA);
    // Private fields can not be accessed, because we are in different class
    // System.out.println("noModifierFieldA is " + aParent.noModifierFieldA);
    // No modifier fields can not be accessed, because we are in different package
    // System.out.println("protectedFieldA is " + aParent.protectedFieldA);
    // Protected fields can not be accessed, because we are not extending the class
    System.out.println("publicFieldA is " + aParent.publicFieldA);
    // Public fields are can ALWAYS be accessed

    // The same applies for aChild

    // System.out.println("privateFieldB is "+bParent.privateFieldB);
    // Private fields can not be accessed, because we are in different class.
    System.out.println("noModifierFieldB is "+bParent.noModifierFieldB);
    System.out.println("protectedFieldB is "+bParent.protectedFieldB);
    // Protected fields CAN be accessed from the same package, from classes, which do NOT extend the class where they were declared
    System.out.println("publicFieldB is "+bParent.publicFieldB);
  }
}
