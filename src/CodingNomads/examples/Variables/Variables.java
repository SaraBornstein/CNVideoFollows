package CodingNomads.examples.Variables;

import jdk.nashorn.internal.ir.CallNode;

public class Variables {

    static double val = 123.45; //global variable, field. Declared at class level, can be used anywhere in class. Global variables take up more space/memory, try to avoid if not needed.

    public static void main(String[] args)  //need the main method to run
    {
        Person myPerson = new Person("Sara", 32); //This is an object called myPerson
        Person yourPerson = new Person("Ryan", 30);
        Person einstein = new Person("Einstein", 110);

        System.out.println(myPerson.toString());
        System.out.println(yourPerson.toString());
        System.out.println(einstein.toString());

        //double x = multiply(val, val*2);
    }

    public static double multiply(double a, double b) //method parameters, or arguments
    {
        double result = a * b; //result is a local variable to this method. Variable scope limited to local.
                            // Can create as many local variables as you need.
        printNum(result); //This parameter name does not have to be the same as parameter name in printNum.
        return result;
    }

    public static void printNum(double numToPrint) //method printNum takes in a parameter which can be named anything.
    {
        System.out.println(numToPrint);
    }

}
