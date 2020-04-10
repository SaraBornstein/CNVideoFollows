package CodingNomads.examples.objects;

public class Refrigerator {

    //elements
    private boolean isDoubleWide;
    private String brand;
    private double volume;

    //constructor
    public Refrigerator(boolean isDoubleWide, String brand, double volume) {
        this.isDoubleWide = isDoubleWide;
        this.brand = brand;
        this.volume = volume;
    }

    //getters and setters
    public boolean isDoubleWide() {
        return isDoubleWide;
    }

    public void setDoubleWide(boolean doubleWide) {
        isDoubleWide = doubleWide;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    //to string method
    @Override
    public String toString() {
        return "Refrigerator{" +
                "isDoubleWide=" + isDoubleWide +
                ", brand='" + brand + '\'' +
                ", volume=" + volume +
                '}';
    }
}
