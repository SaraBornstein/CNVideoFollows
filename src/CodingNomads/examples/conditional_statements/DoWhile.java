package CodingNomads.examples.conditional_statements;

public class DoWhile {
    public static void main(String[] args) {
        int count = 0;
        do{
            System.out.println("count is " + count);
            count++;
        } while(count < 10);

        System.out.println("All done with do-while loop.");

        //example of nesting

        int innerCount = 0;
        int outerCount = 0;

        while(outerCount<10){
            while(innerCount<10){
                System.out.println("outerCount = " + outerCount + " innerCount = " + innerCount);
                innerCount++;
                }
            innerCount = 0; //innercount reset to 0;
            outerCount++;
            }
        }

    }

