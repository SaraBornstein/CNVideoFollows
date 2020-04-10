package CodingNomads.examples.objects;

//POJO: Plain Old Java Object- just defines a
public class Dishwasher {
    private boolean isEngergyEfficient;
    private String brand;
    private int yearsOld;

    //generated constructor that takes in each of the elements
    public Dishwasher(boolean isEnergyEfficient, String brand, int yearsOld) {
        this.isEngergyEfficient = isEnergyEfficient;
        this.brand = brand;
        this.yearsOld = yearsOld;
    }

    //generated getter & setter: part of encapsulation

    public boolean isEnergyEfficient() {
        return isEngergyEfficient;
    }

    public void isEnergyEfficient(boolean energyEfficient) {
        isEngergyEfficient = energyEfficient;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    //to string method: returns a string that describes the current object.
    @Override
    public String toString() {
        return "Dishwasher{" +
                "isEngergyEfficient=" + isEngergyEfficient +
                ", brand='" + brand + '\'' +
                ", yearsOld=" + yearsOld +
                '}';
    }
}
