package CodingNomads.examples.objects;

public class Oven {

    //elements
    private boolean gasRange;
    private int maxTemp;
    private String brand;

    //constructor
    public Oven(boolean gasRange, int maxTemp, String brand) {
        this.gasRange = gasRange;
        this.maxTemp = maxTemp;
        this.brand = brand;
    }

    //getters & setters
    public boolean isGasRange() {
        return gasRange;
    }

    public void setGasRange(boolean gasRange) {
        this.gasRange = gasRange;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //to string method
    @Override
    public String toString() {
        return "Oven{" +
                "gasRange=" + gasRange +
                ", maxTemp=" + maxTemp +
                ", brand='" + brand + '\'' +
                '}';
    }
}
