package CodingNomads.examples.exceptions;

public class SomeClass {

    public static void someMethod(int[] nums){

         try {
            for (int i = 0; i <= nums.length; i++){  //will throw array index out of bounds exception
                System.out.println(nums[i] / nums[i + 1]); //if any #s = 0, arithmetic exception thrown
            }
//Need to build in exception handling because we may not be the ones using our code, someone else may use and have different array numbers which will not work the same way as our array.
        } catch(ArrayIndexOutOfBoundsException aeExc){
            System.out.println("Array index out of bounds");
        } catch(ArithmeticException arExc){
            System.out.println("division by zero not allowed");
        } catch (Exception exc) { //This one will catch everything else.
            System.out.println("error detected");
            exc.printStackTrace();
        } finally { //will always run
             System.out.println("will always execute");
         }

            System.out.println("Program Complete");
    }
}
