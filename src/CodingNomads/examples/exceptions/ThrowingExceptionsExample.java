package CodingNomads.examples.exceptions;

//throw exceptions to other method when the method is not prepared or able to handle the exception
/*
Example:
Method that sends an email/text message. Error occurs in message (like no internet connection)
The method throws any exception that occurs back to the method that calls it.
(Any of 50+ methods could have called on this method to send the email/text and the one method doesn't know if exceptions occur in any of the calling methods.)
All these methods may do something different if exception occurs so they all need to know.
  One may log an error in the database, one may send an email, one may do something else.
  Error has to be thrown to all of them.
 */

public class ThrowingExceptionsExample {
    public static void main(String[] args) {
        try{
            methodOne();
        } catch(ArrayIndexOutOfBoundsException exc){
            //this catch is actually "re-catching" the exception thrown from methodTwo
            System.out.println("exception caught");
        }
    }

    //methodOne will immediately throw any exceptions that occur to the main()
    public static void methodOne() throws ArrayIndexOutOfBoundsException {
        //methodTwo throws an Exception - we're not going to catch it here
        //we're going to pass it up to the main() method to handle it as needed
        methodTwo();
    }

    public static void methodTwo() throws ArrayIndexOutOfBoundsException {
        int[] nums = {1, 2, 3};

        try {
            int x = nums[10];
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Exception caught in methodTwo");
            System.out.println("Now manually throwing exception back to methodOne");
            //the line below will "re-throw" the exception to methodOne
            throw exc;
        }
    }
}
