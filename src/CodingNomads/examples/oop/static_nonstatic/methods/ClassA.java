package CodingNomads.examples.oop.static_nonstatic.methods;

public class ClassA {
    public static void main(String[] args) {

        //calling static method (from this static method) in same class:

        staticMethod(); //just print the method name

        int x = multiply(23, 56); //multiply() returns an int so must capture that value in an int (x) here.
        System.out.println(x); //now can use that variable.

        double pi = Math.PI; //Cannot make an obj of math class b/c constructor is private. Every one of its variables is static and final,
        //meaning does not pertain to any one specific variable. And final means it can't be changed.
        //don't need an object to use the math class.

        //calling non-static method in the same class: (non-static methods work at the object level
        ClassA obj = new ClassA(); //create new object
        obj.nonStaticMethod(); //use object to access non-static methods
        double y = obj.multiply(12.34, 67.89);
        System.out.println(y);
        obj.nonStatic1();

        //call static method in another class
        ClassB.staticMethod();

        //call a non-static method in another class: create an object
        ClassB obj2 = new ClassB();
        obj2.nonStaticMethod();


    }

    //static methods:

    public static void staticMethod(){
        System.out.println("printing staticMethod");
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    //non-static methods:

    public void nonStaticMethod(){
        System.out.println("printing nonStaticMethod");
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public void nonStatic1(){
        nonStatic2(); //a non-static in same class can call a non-static by just typing out the method name
    }

    public void nonStatic2(){
        System.out.println("pringing non-static 2");
    }
}
