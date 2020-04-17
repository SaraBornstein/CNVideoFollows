package CodingNomads.examples.oop.inheritance;

import CodingNomads.examples.oop.polymorphism.MotorizedTransport;

//example of abstraction: have abstracted these common traits of Truck and Sedan to their own class.
public abstract class Vehicle implements MotorizedTransport {

    //any class that has access to Vehicle will have access to these vars as if they are their own.
    protected String make;
    protected String model;
    protected double miles;
    public final double PI = 3.14; //final vars cannot be changed and are noted with ALL CAPS NAMES.

    //constructor
    public Vehicle(String make, String model, double miles) {
        this.make = make;
        this.model = model;
        this.miles = miles;
    }

    //implement methods (control + enter > implement methods)
    //override notation will throw an error if something changes and parent class methods no longer match these ones.

    /*
    //removed the start method to demonstrate abstract classes. Now need to add "abstract" before "class Vehicle".
    //abstract allows for not having to use all the methods in the interface.
    @Override
    public boolean start() {
        System.out.println("starting vehicle");
        return true;
    }
    */

    @Override
    public void stop() {
        System.out.println("stopping vehicle");
    }

    @Override
    public void accelerate(double mph) {
        System.out.println("accelerating vehicle");
    }

    @Override
    public void decelerate(double mph) {
        System.out.println("decelerating vehicle");
    }

    //constructor
    public Vehicle() {
        //stuff we have to do in here
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
