package CodingNomads.examples.conditional_statements;

public class WhileLoop
{

        public static void main(String[] args)
        {

            int count = 0;

            while (count < 10)
            {
                System.out.println("count is " + count);
                count ++; // if you don't increment count, this will be an infinite loop!
            }

            System.out.println("All done!");
        }

}


