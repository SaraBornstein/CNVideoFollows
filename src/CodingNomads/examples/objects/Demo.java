package CodingNomads.examples.objects;

public class Demo {
    public static void main(String[] args) {

        //create new objects of each class
        Oven myOven =  new Oven(true, 500, "GE"); //The parameters are needed based on the elements specified in the class.
        Dishwasher dishwasher = new Dishwasher(true, "GE", 5);
        Refrigerator fridge = new Refrigerator(true, "Kenmore", 150);
        Sink sink = new Sink(true, "sinkBrand", "stainless steel");
        Kitchen myKitchen = new Kitchen(dishwasher, myOven, fridge, sink);

        System.out.println("My kitchen has a " + myKitchen.getOven().getBrand() + " oven with a max temp of " + myKitchen.getOven().getMaxTemp());

    }
}
