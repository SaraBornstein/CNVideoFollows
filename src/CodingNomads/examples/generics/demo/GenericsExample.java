package CodingNomads.examples.generics.demo;

import java.util.ArrayList;
import java.util.HashMap;

/*
Can have generic classes, methods, and constructors
 */

public class GenericsExample {
    public static void main(String[] args) {
        int a = multiply(34f, 56.45);



    ArrayList<String> aList = new ArrayList();
        aList.add("Hello Generics!");

    ArrayList<Integer> bList = new ArrayList(); //this is same ArrayList class
        bList.add(56); //but can use with a different type of input

    //Another common generic, HashMap<K,V> takes 2 different types (Key, Value)
        //Example: contains state names (String), and populations (Integer)
    //HashMap is a data structure, has keys and values like a phone book
        //Key = name, value = phone #
    HashMap<String, String> phoneBook = new HashMap();
        phoneBook.put("Ryan", "555-555-5555");
        phoneBook.put("Kim", "444-444-4444");

        //run Hash to find where index should go or can be found, does not need to iterate over all like array
        System.out.println(phoneBook.get("Ryan"));


    GenericClass<Integer, Double> gen1 = new GenericClass(); // Y = Integer, Z = Double

    }

    /*
    For Example: this multiply function only works with ints.
    Creating a generic for multiply() will allow this function to be used with
    int, double, long, etc.
     */
    public static int multiply(int a, int b){
            return a*b;
    }
    //instead of overload multiply() with several multiply statements with diff types,
    //use generic method: <generic info in brackets describes types for parameter list>
    public static <T extends Number, V extends Number> int multiply(T a, V b){
        //above <> is example of bounded types, can use object types (Example: extends Vehicle)
        return a.intValue() * b.intValue();
    }

    //simple generic method example
    public static <T> void doSomething(T val){
        System.out.println(val);
    }

    //wildcard generic method: '?' argument here is generic, this array list can be any type of number
    public static double sumCollection(ArrayList<? extends Number> nums){
        double sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += (double) nums.get(i).doubleValue();
        }
        return sum;
    }

}
