package CodingNomads.examples.lamdas;

public class LambdaExample_1 {
    public static void main(String[] args) {


        /*
        Components of a functional interface:
        - name of the interface
        - object name
        - =
        - (the parameters)
        - arrow ->
        - body of the lambda {}, in only one line no brackets needed
         */
        MyInterface obj = () -> {
            //body of abstract method from MyInterface
            System.out.println("I'm in a Lambda!");
        }; //This can be written: MyInterface obj = () -> System.out.println("I'm in a Lambda!");

        obj.someMethod();

        /*
         //can redefine obj:
        obj = () -> {
            System.out.println("I'm in a new Lambda!");
        };
        obj.someMethod();

        //lets us pass around functions
         */

    }
}
