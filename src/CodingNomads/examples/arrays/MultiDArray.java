package CodingNomads.examples.arrays;

public class MultiDArray {
    public static void main(String[] args) {

        int[][] vals = new int[5][6]; //depth of 5, width of 6

        /*
        0 1 2 3 4 5
        1
        2
        3
        4
         */

        int[][] arr = new int[5][5];
        int count = 0;

        //populating the array
        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = count;
                count++;
            }
        }

        //to print array
        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println();
        }



    }
}
