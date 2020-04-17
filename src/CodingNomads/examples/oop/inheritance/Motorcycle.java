package CodingNomads.examples.oop.inheritance;

import com.sun.xml.internal.bind.v2.TODO;

public class Motorcycle extends Vehicle {

    private int cc;
    private boolean twoSeat;

    //constructor
    public Motorcycle(String make, String model, double miles, int cc, boolean twoSeat) {
        super(make, model, miles);
        this.cc = cc;
        this.twoSeat = twoSeat;
    }

    public void demonstrateThisSuper(){
        this.accelerate(20);
        super.accelerate(30);
    }

    //must implement start method
    @Override
    public boolean start() {
        System.out.println("starting motorcycle");
        return false;
    }

    @Override // Stops people accidentally changing this or the overridden method. Will throw an error if the two methods differ.
    public void accelerate(double mph){
        System.out.println("motorcycle accelerating (different because of @override)");
        //steps to accelerate a motorcycle
    }

    //get/set

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean isTwoSeat() {
        return twoSeat;
    }

    public void setTwoSeat(boolean twoSeat) {
        this.twoSeat = twoSeat;
    }
}
