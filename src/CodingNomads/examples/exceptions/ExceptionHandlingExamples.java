package CodingNomads.examples.exceptions;

public class ExceptionHandlingExamples {
    public static void main(String[] args) {

        int[] nums = {34, 65, 78, 0};
/*
        System.out.println(nums[10]);
        System.out.println("Program Complete"); //won't print because previous line causes an error and the program quits.

//use a try/catch statement to handle this problem "gracefully"
        //try block
        try {

            int x = nums[1] / nums[3]; // x=65/0 is not allowed. Throws exception.

        //catch block / multi-catch block
        } catch(ArrayIndexOutOfBoundsException aeExc){ //due to exception hierarchy, this exception has to come before the broad error catch "Exception"
            System.out.println("Array index out of bounds");
        } catch(ArithmeticException arExc){
            System.out.println("division by zero not allowed");
        }
        catch (Exception exc) {
            System.out.println("error detected");
            exc.printStackTrace();
        }

        System.out.println("Program Complete");
 */

        SomeClass.someMethod((nums));

        System.out.println("super complete");
    }
}
