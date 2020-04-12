package CodingNomads.examples.methods.pass_by_value;

public class PassByVal {

    public static void main(String[] args) {
       double a = 12;
       double b = 14;
        System.out.println("before a: " + a);
        System.out.println("before b: " + b);

        someOtherMethod(a, b); //This method modifies a & b

        //a & b are still the same value after the method runs
        System.out.println("before a: " + a);
        System.out.println("before b: " + b);
        //This demonstrates that primitive types when passed to another method, the method gets
        //its own copy

    }

    public static void someOtherMethod(double a, double b){
        a = a * 10;
        System.out.println(a);
        b = b * 20;
        System.out.println(b);
        //The primitive variables changed in this method do not change the variable values in the main method.
        //This is called "pass by value"
    }
}
