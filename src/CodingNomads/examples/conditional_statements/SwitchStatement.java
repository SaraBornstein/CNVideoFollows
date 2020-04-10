package CodingNomads.examples.conditional_statements;

public class SwitchStatement
{

    public static void main(String[] args)
    {

        int i = 4;

        switch(i)
        {
            case 0:
                System.out.println("i is 0");
                break;
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            case 4:
                System.out.println("i is 4");
                break;
            case 5:
                System.out.println("i is 5");
                break;
            default:
                System.out.println("default was hit");
        }
    }
}
