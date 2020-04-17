package CodingNomads.examples.oop.polymorphism;

public class Dependency {

    MotorizedTransport transport; //"Dependency injection". Example of polymorphism- this class can act in a number of different ways, using a number of different classes (truck, sedan...)
    //Any subclass that implements MotorizedTransport will now be able to use transport as a variable

    //constructor
    public Dependency(MotorizedTransport transport) {
        this.transport = transport;
    }

    //calling methods of MotorizedTransport
    public void testMethods(){
        transport.start();
        transport.accelerate(20);
        transport.stop();
        System.out.println("------------------------");
    }

    //setter
    public void setTransport(MotorizedTransport transport) {
        this.transport = transport;
    }
}
