package CodingNomads.examples.lamdas;

import java.util.SimpleTimeZone;

public class AnonymousInnerClass {
    public static void main(String[] args) {

        //this is an anonymous inner class. Can't define obj alone.
        //must instantiate by defining methods using override.
        //this class only available in the main() here. Not accessible elsewhere
        SimpleInterface obj = new SimpleInterface() {
            @Override
            public void methodOne() {
                System.out.println("In methodOne in Anon");
            }

            @Override
            public int methodTwo(int a, int b) {
                return a * b;
            }
        };

        SimpleClass obj2 = new SimpleClass();

        obj.methodOne(); //calling the obj of method2
        int a = obj.methodTwo(4,6);

        obj2.methodOne();
        int b = obj2.methodTwo(5, 7);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
