package CodingNomads.examples.methods;

public class RecursiveFactorial { //A recursion method calls itself
    public static void main(String[] args) {
        int x = factorial(5);
        System.out.println(x);
    }

    //fatorial 5 = 1 * 2 * 3 * 4 * 5 = 120

    static int factorial(int x){
        int total;

        // base case -  this will be used to end the recursive calls
        if(x == 1)
            return 1;
        //other wise, factorial is called and passed x-1,
        //reducing x each time until it reaches 1.
        total = x * factorial(x-1);
        /*
         First: 5! = 5 * factorial(4), but we don't know what factorial(4) is
         Then: 4 * 3! but we don't know what factorial(3) is
         Then: 3 * 2!
         Then: 2 * 1!
        These unfinished calculations are being "put on the stack"
        2 types of memory in java: stack & heap. Stack is first in, last out data structure:
            Stack looks like:
                2 * 1! -> !1 = 1 because method tells us when 1 is called return 1, so now we know this is 2 * 1 = 2
                3 * 2! -> 2! == 2 * 1! so now we know this is 3 * 2 = 6
                4 * 3! -> 4 * 6 = 24 (3! we now know from above is 1*2*3 = 6)
                5 * 4! -> 5 * 24 = 120
                5! (oldest) = 120

        If your stack of plates gets so tall it hits the ceiling and there's not more room to place any more plates, you have StackOverflowError. This is semi-common with recursion.
        */

        return total;
    }
}
