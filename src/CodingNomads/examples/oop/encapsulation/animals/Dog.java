package CodingNomads.examples.oop.encapsulation.animals;

//the class is the root of all encapsulation
public class Dog {

    //access modifiers are the next level of encapsulation
    //all the data (instance variables) for Dog are in this class.
    private String breed;
    private String name;
    private int age;
    //generally all variables should be private unless they NEED to be protected or public.

    //all the methods that act on the data are encapsulated in this class.
    //getters & setters: used to access the private variables.
    //These get/set methods often include validations (is what you're trying to change valid?)
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
