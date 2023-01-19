package Arrays;

public class insertElement {
    public static void main(String[] args) {

        int position = 3;

        int element = 100;


        int[] intArray = {10, 20, 30, 40, 50, 0};

        for(int i = intArray.length-1; i>position-1; i--) {
            {
                intArray[i] = intArray[i-1];
            }
        }
            intArray[position-1] = element;


        for(int j = 0; j<intArray.length; j++) {
            System.out.println("after shifting : :  " + intArray[j]);
        }
        }
}
