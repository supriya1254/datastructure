package Arrays.programs;

public class firstLargestNumber {

    public static void main(String[] args) {

        int[] intArray = {10, 15, 100, 20, 77, 89, 6};

        int temp = intArray[0];

        for (int i = 0; i< intArray.length; i++) {

            while(temp < intArray[i] ) {
                temp = intArray[i];
            }
        }
        System.out.println(temp);
    }
}
