package CodingNomads.examples.oop.static_nonstatic.variables;

public class House {

    //2 non static vars: These are unique to each house.
    int squareFeet;
    String address;

    //static var: every obj of a class has access to this single var in memory.
    //This is not unique to each house, so all houses can share.
    static int numHousesBuilt;

    //constructor
    public House(int squareFeet, String address) {
        this.squareFeet = squareFeet;
        this.address = address;
        numHousesBuilt++; //incrementing the static var
    }

    //to string

    @Override
    public String toString() {
        return "House{" +
                "squareFeet=" + squareFeet +
                ", address='" + address + '\'' +
                ", numHousesBuilt=" + numHousesBuilt + '}';
    }
}
