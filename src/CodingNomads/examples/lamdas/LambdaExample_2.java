package CodingNomads.examples.lamdas;

import java.util.function.Function;

public class LambdaExample_2 {
    public static void main(String[] args) {

        //define lambda expression
        FunctionalInterfaceExample obj = (double x, double y) -> {
            if (x > y) {
                return x;
            } else {
                return y;
            }
        };

        double largerNumber = obj.calculate(567, 234);
        System.out.println(largerNumber);

        //redefine lambda expression
        obj = (double x, double y) -> {
            return x * y;
        };

        double value = obj.calculate(345, 678);
        System.out.println(value);

        //redefine lambda expression again
        obj = (double x, double y) -> {
            return (x * x) * (y * y); //defining body of the method on the fly here
        };

        double num = obj.calculate(345, 768); //then can use the method after defining it
        System.out.println(num);

    }
}
