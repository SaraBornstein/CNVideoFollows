package CodingNomads.examples.oop.inheritance;

//example of abstraction: have abstracted these common traits of Truck and Sedan to their own class.
public class Vehicle {

    //any class that has access to Vehicle will have access to these vars as if they are their own.
    protected String make;
    protected String model;
    protected double miles;
    public final double PI = 3.14; //final vars cannot be changed and are noted with ALL CAPS NAMES.

    public void accelerate(double mph){
        System.out.println("vehicle accelerating by " + mph + " mph");
        //steps to accelerate a vehicle
    }

    //constructor
    public Vehicle() {
        //stuff we have to do in here
    }

    //constructor
    public Vehicle(String make, String model, double miles) {
        this.make = make;
        this.model = model;
        this.miles = miles;
    }

    //getter and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
