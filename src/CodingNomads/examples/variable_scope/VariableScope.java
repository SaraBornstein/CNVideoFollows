package CodingNomads.examples.variable_scope;

public class VariableScope
{
    static int globalVar = 10;

    public static void main(String[] args) {
        Vehicle myCar = new Vehicle();
        myCar.make = "Subaru"; //Dot notation gives access to public object fields.
        myCar.model = "Crosstreck";
        myCar.year = 2014;
    }

    public static int multiply(int a, int b)
    {
        int result = a * b * globalVar;
        return result;
    }

    public static int divide(int a, int b)
    {
        int val = globalVar / a / b;
        return val;
    }
}
