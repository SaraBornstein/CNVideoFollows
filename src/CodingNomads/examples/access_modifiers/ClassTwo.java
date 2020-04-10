package CodingNomads.examples.access_modifiers;

public class ClassTwo {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();

        classOne.publicVar = 10;
        classOne.protectedVar = 20;
        //classOne.privateVar does not work. The var cannot be accessed outside the ClassOne
        classOne.changePrivateVar(30); //can access PrivateVar through public method.
    }
}
