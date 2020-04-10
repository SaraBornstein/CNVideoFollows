package CodingNomads.examples.access_modifiers2;

import CodingNomads.examples.access_modifiers.ClassOne;

public class ClassThree {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();

        classOne.publicVar = 10;
        //classOne.protectedVar = 20; ClassThree is not in the same package as the class that contains protectedVar,
                                        // so the var is not available. Same applies to methods.
        //classOne.privateVar does not work. The var cannot be accessed outside the ClassOne
        classOne.changePrivateVar(30); //can access PrivateVar through public method.
    }
}
