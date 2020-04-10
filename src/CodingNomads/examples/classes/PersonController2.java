package CodingNomads.examples.classes;

public class PersonController2 {
    public static void main(String[] args) {
        Person somePerson = new Person(36, 75, "Ryan");
        Person someOtherPerson = new Person(33, 65, "Kim");

        System.out.println("The first person is named " + somePerson.name + " and he/she is " + somePerson.height + " inches tall and " + somePerson.age + " years old.");
        System.out.println("The first person is named " + someOtherPerson.name + " and he/she is " + someOtherPerson.height + " inches tall and " + someOtherPerson.age + " years old.");


    }
}
