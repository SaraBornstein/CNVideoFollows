package CodingNomads.examples.oop.inheritance;

//POJO
public class Truck extends Vehicle {

    private double bedCapacity;

    //constructor with no params
    public Truck(String make, String model, double miles, double bedCapacity) {
        super(make, model, miles);
        this.bedCapacity = bedCapacity;
    }

    //getter and setter
    public double getBedCapacity() {
        return bedCapacity;
    }

    public void setBedCapacity(double bedCapacity) {
        this.bedCapacity = bedCapacity;
    }
}
