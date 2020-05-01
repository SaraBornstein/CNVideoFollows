package CodingNomads.examples.exceptions;

public class UnderAgeException extends Exception{

    @Override //overriding toString method in Throwable class
    public String toString() {
        return "UnderAgeException{Must be 21 to buy alcohol in the US}"; //this will print when use Exception.getMessage
    }
}
