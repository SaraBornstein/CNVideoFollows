package CodingNomads.examples.classes;

public class PersonController {
    public static void main(String[] args) {

        Person somePerson = new Person();
        Person someOtherPerson = new Person(); //always have () because an object is a unique method.

        somePerson.age = 36;
        somePerson.height = 75;
        somePerson.name = "Ryan";

        someOtherPerson.age = 32;
        someOtherPerson.height = 60;
        someOtherPerson.name = "Sara";

        System.out.println("The first person is named " + somePerson.name + " and he/she is " + somePerson.height + " inches tall and " + somePerson.age + " years old.");
        System.out.println("The first person is named " + someOtherPerson.name + " and he/she is " + someOtherPerson.height + " inches tall and " + someOtherPerson.age + " years old.");

    }
}
