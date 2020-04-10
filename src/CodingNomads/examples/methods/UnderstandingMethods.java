package CodingNomads.examples.methods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingMethods {

    public static void main(String[] args) {
        //The main method is where every application begins by default
        System.out.println("First we're here.");
        printCurrentTime(); //calling a method. Calling the method printCurrentTime() and assigning it to a variable called time.
                                            //if method printCurrentTime() does not return anything (void), "String time = " not needed.

        System.out.println("Finally we finish here.");
    }

    public static void printCurrentTime(){ //This method returns a string.
                                            // If this were: public static VOID printCurrentTime(){, the method wouldn't return anything.
        System.out.println("2nd we print the time.");
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("The current time is: " + time);
    }

}
