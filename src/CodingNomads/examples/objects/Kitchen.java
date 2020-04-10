package CodingNomads.examples.objects;

/*
Object Compostion = "Has A" relationships:
The kitchen "has a" dishwasher, oven, refrigerator, sink, etc." Each of those are their own objects.
*/

public class Kitchen {

    //Using private instance variables with getter & setter methods to access them.

    Dishwasher dishwasher;
    Oven oven;
    Refrigerator fridge;
    Sink sink;


    //constructor
    public Kitchen(Dishwasher dishwasher, Oven oven, Refrigerator fridge, Sink sink) {
        this.dishwasher = dishwasher;
        this.oven = oven;
        this.fridge = fridge;
        this.sink = sink;
    }

    //getters and setters
    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public void setDishwasher(Dishwasher dishwasher) {
        this.dishwasher = dishwasher;
    }

    public Oven getOven() {
        return oven;
    }

    public void setOven(Oven oven) {
        this.oven = oven;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public void setFridge(Refrigerator fridge) {
        this.fridge = fridge;
    }

    public Sink getSink() {
        return sink;
    }

    public void setSink(Sink sink) {
        this.sink = sink;
    }

    //to string
    @Override
    public String toString() {
        return "Kitchen{" +
                "dishwasher=" + dishwasher +
                ", oven=" + oven +
                ", fridge=" + fridge +
                ", sink=" + sink +
                '}';
    }
}
