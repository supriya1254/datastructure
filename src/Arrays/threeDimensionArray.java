package Arrays;

/* declaration of 2-D array
    int[][][] arr;
    int[] [][]arr;
    int[] []arr[];
    int [][]arr[];
    int []arr[][];


    creation :
    arr = new int[2][3][4]; (it means 3 row and 3 columns. where first column have two elements,
     second column have three elements and 3rd column have 4 elements)


    initialization :
    arr = {{{},{},{}}}
 */


public class threeDimensionArray {
    public static void main(String[] args) {
        int[][][] intArray = {{{10,20,30},{40,50},{60,70,80}}};

        for (int i=0; i<intArray.length;i++) {

            for(int j = 0; j<intArray[i].length; j++) {

                    for(int k = 0; k<intArray[i][j].length; k++ ) {

                        System.out.print(intArray[i][j][k] + " ");
                    }
                System.out.println();
            }


        }


    }
}
