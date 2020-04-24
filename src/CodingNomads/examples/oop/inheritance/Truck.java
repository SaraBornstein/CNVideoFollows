package CodingNomads.examples.oop.inheritance;

//POJO
public class Truck extends Vehicle {

    private double bedCapacity;

    //constructor
    public Truck(String make, String model, double miles, double bedCapacity) {
        super(make, model, miles);
        this.bedCapacity = bedCapacity;
    }

    @Override
    public boolean start() {
        System.out.println("starting truck");
        return false;
    }

    //getter and setter
    public double getBedCapacity() {
        return bedCapacity;
    }

    public void setBedCapacity(double bedCapacity) {
        this.bedCapacity = bedCapacity;
    }
}
