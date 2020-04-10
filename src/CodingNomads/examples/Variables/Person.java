package CodingNomads.examples.Variables;

public class Person {
    String name;
    int age; //instance variable. Describes an object of this class. This variable is declared outside of a method in the Person class.
    static int numPersonsCreated; //static variable shared across all instances of this class. Name and age may change in each instance, but all instances with share this same value.

    public Person(String name, int age) //constructor
    {
        this.name = name;
        this.age = age;
        numPersonsCreated++;
    }

    @Override
    public String toString() //a "helper method", returns a string that describes the object.
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numPersonsCreated=" + numPersonsCreated +
                '}';
    }


}
