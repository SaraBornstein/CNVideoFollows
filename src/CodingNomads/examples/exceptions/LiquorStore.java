package CodingNomads.examples.exceptions;
import java.util.Scanner;

public class LiquorStore {

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (UnderAgeException e) {
            System.out.println(e.toString());
        }
    }

    public static void someMethod() throws UnderAgeException {
        buyWine();
        //when this method is called, because method can throw error, surround by try/catch
        //OR add to method signature and pass on to other method (like the main).
    }

    public static void buyWine() throws UnderAgeException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to CodingNomads Liquor Store");
        System.out.println("Are you over 21 years of age? y/n");
        String response = scanner.next();

        if(response.equalsIgnoreCase("n")){
            throw new UnderAgeException(); //if this statement here, must either add "throws" to method signature or surround by try/catch.
        /*
        Functional equivalent, but if we don't need the exc object, just put it all in one line as above:
        if(response.equalsIgnoreCase("n")){
            UnderAgeException exc =  new UnderAgeException();
            throw esc;
         */
        }

        System.out.println("Great, what can we get for you?");
    }
}
