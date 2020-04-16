package CodingNomads.examples.oop.inheritance;

public class CarController {
    public static void main(String[] args) {

        //objects, subclasses of vehicle class
        Truck truck = new Truck("Ford", "F150", 120000, 500);
        Sedan sedan =  new Sedan("Honda", "Civic", 60000, 80);
        Motorcycle moto = new Motorcycle("Ducati", "Monster", 500, 1000, false);

        System.out.println(truck.getMake() + " " + truck.getModel()
        + " " + truck.getBedCapacity());
        truck.accelerate(10);

        System.out.println(sedan.getMake() + " " + sedan.getModel()
                + " " + sedan.getTrunkCapacity());
        sedan.accelerate(20);

        System.out.println(moto.getMake() + " " + moto.getModel()
                + " " + moto.getCc());
        moto.accelerate(30); //This one has an override in th class Motorcycle so the accelerate acts differently.
    }
}
