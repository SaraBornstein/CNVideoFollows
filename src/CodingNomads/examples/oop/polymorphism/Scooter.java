package CodingNomads.examples.oop.polymorphism;

public class Scooter implements MotorizedTransport{

    //implement methods from Motorized Transport
    @Override
    public boolean start() {
        System.out.println("starting scooter");
        return false;
    }

    @Override
    public void stop() {
        System.out.println("stopping scooter");
    }

    @Override
    public void accelerate(double mph) {
        System.out.println("accelerating scooter");
    }

    @Override
    public void decelerate(double mph) {
        System.out.println("decelerating scooter");
    }
}
