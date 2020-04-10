package CodingNomads.examples.objects;

public class Sink {

    //elements
    private boolean dualSink;
    private String brand;
    private String basinType;

    //constructor
    public Sink(boolean dualSink, String brand, String basinType) {
        this.dualSink = dualSink;
        this.brand = brand;
        this.basinType = basinType;
    }

    //getters and setters

    public boolean isDualSink() {
        return dualSink;
    }

    public void setDualSink(boolean dualSink) {
        this.dualSink = dualSink;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBasinType() {
        return basinType;
    }

    public void setBasinType(String basinType) {
        this.basinType = basinType;
    }

    //to string method
    @Override
    public String toString() {
        return "Sink{" +
                "dualSink=" + dualSink +
                ", brand='" + brand + '\'' +
                ", basinType='" + basinType + '\'' +
                '}';
    }
}
