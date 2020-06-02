package CodingNomads.examples.lamdas;

//functional interface has a single abstract method
@FunctionalInterface //will throw an error if there is more than 1 abstract method
//if more than 1 abstract method, all lambda expressions will break.
public interface MyInterface {

    public void someMethod(); //abstract method (1 allowed) has no body

    /*
    //can have any number of default methods (a method that has a body)
    public default void someOtherMethod(){
        System.out.println("Some functionality");
    }
    */
}
