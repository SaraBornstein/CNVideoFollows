package CodingNomads.examples.oop.inheritance;

public class Sedan extends Vehicle {

        private double trunkCapacity;

        //constructor
        public Sedan(String make, String model, double miles, double trunkCapacity) {
                super(make, model, miles); //call to super must be 1st thing in constructor body
                this.trunkCapacity = trunkCapacity;
        }

        @Override
        public boolean start() {
                System.out.println("starting sedan");
                return false;
        }

        //getter/setter
        public double getTrunkCapacity() {
                return trunkCapacity;
        }

        public void setTrunkCapacity(double trunkCapacity) {
                this.trunkCapacity = trunkCapacity;
        }
}
