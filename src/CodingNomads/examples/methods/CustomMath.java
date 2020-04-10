package CodingNomads.examples.methods;

public class CustomMath {
    public static int multiply(int a, int b){
        return a * b;
        /*
        "return" is a keyword that directs java to exit the method immediately.
        If the method returns a value you must return a value. In a void method
        you just type "return".
         */
    }

    public int divide(int a, int b){ //the "static" word is optional, however without static, need to create an object of class CustomMath in MathController(class calling this method)
        return a / b; //Side note: This can throw an exception if b == 0.
    }

}
