package CodingNomads.examples.arrays;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args){

       //ArrayList<String> arrayList =  new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Programming");
        arrayList.add("is");
        arrayList.add("so");
        arrayList.add("cool!");
        String val = arrayList.get(4);
        boolean check = arrayList.contains("Programming");

        for(String s : arrayList){
            System.out.println(s);
        }

    }

}