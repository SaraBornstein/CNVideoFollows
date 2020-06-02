package CodingNomads.examples.lamdas;

public class SimpleClass implements SimpleInterface{

    @Override
    public void methodOne() {
        System.out.println("In methodOne in simpleClass");
    }

    @Override
    public int methodTwo(int a, int b) {
        return a * b;
    }
}
