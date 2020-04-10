package CodingNomads.examples.arrays;

public class ArrayExample
{
    public static void main(String[] args)
    {
        int [] intArray = new int[5]; //Arrays are fixed length. Must declare a size. Also variable types must all be the same.
        intArray[0] = 97;
        intArray[1] = 17;
        intArray[2] = 56;
        intArray[3] = 14;
        intArray[4] = 39;

        //For Loop
        for(int i=0; i<intArray.length; i++)
        {
            System.out.println("The array value at the index of " + i + " is " + intArray[i]);
        }

        //Alternative Array Declaration Syntax. If array values are known, array can be initialized with value.
        int[] intArray2 = {1, 2, 3, 4, 5};
    }

    public static void printArray(int[] vals)
    {
        for(int i=0; i<vals.length; i++)
        {
            System.out.println(vals[i]);
        }
    }
}
