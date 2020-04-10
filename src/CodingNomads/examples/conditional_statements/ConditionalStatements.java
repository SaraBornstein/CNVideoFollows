package CodingNomads.examples.conditional_statements;

public class ConditionalStatements {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        boolean bool1 = true;
        boolean bool2 = false;

        // if/else if ladder. If statements can be nested inside if/else if
        if (a<b && bool1) //inside the () must be a conditional statement.
        {
            System.out.println("a is less than b");
        }
        else if (b>30) //can have as many else if statements as you want
        {
            System.out.println("a is greater than 30");
        }
        else
            {
                System.out.println("a is not less than b and b is not greater than 30");
            }


    }
}
