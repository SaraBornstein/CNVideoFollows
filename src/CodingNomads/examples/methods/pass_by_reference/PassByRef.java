package CodingNomads.examples.methods.pass_by_reference;

import CodingNomads.examples.classes.Person;

public class PassByRef {

    public static void main(String[] args) {
        Person sara = new Person(32, 60, "Sara");

        System.out.println(sara.toString());

        addYearToPerson(sara); //pass in the Person object sara

        System.out.println(sara.toString()); //pass by reference
        //the object has been modified after running the addYearToPerson method.
    }

    public static void addYearToPerson(Person person){ //this is pointing at the same person object in memory as the object sara
        person.age = person.age +1; //passed in and modified this object
    }
}
