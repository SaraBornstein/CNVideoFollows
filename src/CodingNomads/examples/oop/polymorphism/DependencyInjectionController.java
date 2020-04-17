package CodingNomads.examples.oop.polymorphism;

import CodingNomads.examples.oop.inheritance.Motorcycle;
import CodingNomads.examples.oop.inheritance.Sedan;
import CodingNomads.examples.oop.inheritance.Truck;

public class DependencyInjectionController {
    public static void main(String[] args) {

        Truck truck = new Truck("Ford", "F150", 120000, 500);
        Sedan sedan =  new Sedan("Honda", "Civic", 60000, 80);

        Motorcycle moto = new Motorcycle("Ducati", "Monster", 500, 1000, false);

        Dependency example = new Dependency(truck); //These classes can be passed in because they implement the MotorizedTransport Interface
        example.testMethods();

        example.setTransport(sedan); //change it to sedan by setting it
        example.testMethods();

        example.setTransport(moto); //change it to motorcycle by setting it
        example.testMethods();
    }
}
