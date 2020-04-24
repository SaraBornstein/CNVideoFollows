package CodingNomads.examples.oop.static_nonstatic.variables;

public class StaticController {
    public static void main(String[] args) {

        House house1 = new House(1000, "123 A Street");
        House house2 = new House(500, "234 B Street");
        House house3 = new House(1500, "567 C Street");

        System.out.println(house1.toString());
        System.out.println(house2.toString());
        System.out.println(house3.toString()); //3 houses built so far as of this calling

        House house4 = new House(2000, "678 D Street"); //a 4th house is built
        System.out.println(house1.toString()); //printing house 1 info again, numHousesBuilt will be 4 now.

    }
}
