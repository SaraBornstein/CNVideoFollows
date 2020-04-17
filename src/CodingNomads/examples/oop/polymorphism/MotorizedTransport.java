package CodingNomads.examples.oop.polymorphism;

public interface MotorizedTransport {

    //interface is like a class, but contains abstract method signatures that do not contain method bodies
    // (except for default methods):
    public boolean start();
    public void stop();
    public void accelerate(double mph);
    public void decelerate(double mph);

    //any class that implements this interface is required to use these methods and give them a body.
    //(See inheritance.Vehicle)
}
