package Arrays;

/* declaration of 2-D array
    int[][] arr;
    int [][]arr;
    int[] []arr;
    int arr[][];
    int[] arr[];


    creation :
    arr = new int[2][3]; (it means two row and 2 columns. where first column have two elements and second column have three elements)


    initialization :
    arr = {{},{}}
 */


public class twoDimensionArray {
    public static void main(String[] args) {
        int[][] intArray = {{10,20,30},{40,50},{60,70,80}};

        for (int i=0; i<intArray.length;i++) {

            for(int j = 0; j<intArray[i].length; j++) {

                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }


    }
}
