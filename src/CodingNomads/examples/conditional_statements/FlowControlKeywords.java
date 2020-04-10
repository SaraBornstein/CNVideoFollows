package CodingNomads.examples.conditional_statements;

public class FlowControlKeywords
{

    public static void main(String[] args)
    {

        //FLOW CONTROL: continue, break, return

        //continue
        for(int i = 0; i<10; i++)
        {
            if(i ==3 || i == 7)
            {
                //forces an early iteration of the loop
                continue;
            }
            System.out.println("i = " + i);
        }

        //break
        for(int i = 0; i<10; i++)
        {
            if(i ==3 || i == 7)
            {
                //exits the nearest loop. Does not return to iteration like continue.
                break;
            }
            System.out.println("i = " + i);
        }

        //return exits the current method, will return a value if required.
        int i = someMethod(1);
        System.out.println("i = " + i);



    }
    public static int someMethod(int val)
{
    if (val == 0) {
        System.out.println("1) Will this print?");
        return 0;
    }
    else if (val == 1) {
        System.out.println("2) Will this print?");
        return 1;
    }

    System.out.println("3) Will this print?");
    return -1;
}
}
