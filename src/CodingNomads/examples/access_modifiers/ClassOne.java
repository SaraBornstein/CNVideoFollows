package CodingNomads.examples.access_modifiers;

public class ClassOne { //classes are always public or default (no modifier)

    public int publicVar;
    protected int protectedVar;
    private int privateVar;

    public void changePrivateVar(int val){
        if(val >= 0 && val <= 1000){
            privateVar =  val; // This method can access privateVar because it is still in the same class.
                                //May need to be accessed to do a data validation check.
        }

    }

/*
    ACCESS MODIFIERS - affect classes, instance variables, and methods
        They play a large role in Encapsulation - one of the primary
        tenants of Object-Oriented Programming

        Public
            Any class, instance variable, or method that is marked as "public"
            can be openly accessible from anywhere in the application.
            It can also be accessed by external applications that are using
            this application (this is something we'll come back to)

        Private
            Only accessible from within the class where the private variable or
            method is declared. Classes are always public or default (no modifier).

        Protected
            Only accessible by classes (and their members) that are declared in
            the same package as the variable or method that is "declared" protected.
            In addition, subclasses whether they are in the same package or not,
            can access protected members (we'll come back to this).

        Default
            the same as protected but not accessible by subclasses
 */

}
