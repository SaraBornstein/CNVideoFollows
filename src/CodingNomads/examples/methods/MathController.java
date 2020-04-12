package CodingNomads.examples.methods;

public class MathController {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        double x = 12.34;
        double y = 45.67;

        int c = CustomMath.multiply(a, b);
        double z = CustomMath.multiply(a, b); //polymorphism (of many forms - overloaded multiply method)
        //This method (CustomMath.multiply()) needs to be assigned to a variable (int x) because the method returns an int.
        //Need CustomMath. because this method is being called from a different class. If being called in same class, no need for the path.
        //*Shortcut: hold down command and hover over the method (multiply) -> intelliJ will take you to where that method is written.



        CustomMath obj = new CustomMath();
        int d = obj.divide(4, 2);
        //because class divide() is not static, need to create an object of the class CustomMath to use to call the divide method.


        System.out.println(x);
        System.out.println(z);
    }
}
