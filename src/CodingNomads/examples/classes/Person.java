package CodingNomads.examples.classes;

//This class is a POJO (Plain Old Java Object)
public class Person { //first letter of class is always capitalized.
    //instance variable
   int age;
   double height;
   String name;

    //Constructors
        //overloading: same constructor, one without parameters, one with. PersonController will call first one, PersonController2 will call the parameterized constructor.
    public Person(){} //default constructor is empty and doesn't do anything.

    public Person(int age, double height, String name){ //parameterized constructor. Takes in parameters
    this.age = age; //this.age refers to int age variable under class Person, age after the equal refers to the parameter in the constructor.
                    //instead, you could give the parameter a different name (example: age1) then it would be age =  age1.
    this.height = height;
    this.name = name;
    }

    //methods

}
