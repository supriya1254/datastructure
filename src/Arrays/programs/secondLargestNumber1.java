package Arrays.programs;

// we need to sort the array then print n+1 or n-1 based on sorting logic

public class secondLargestNumber1 {
    public static void main(String[] args) {


        int[] intArray = {20, 44, 3, 100, 60, 58};
        int temp;

        for (int i = 0; i < intArray.length; i++) {

            for(int j = i+1; j<intArray.length; j++) {

                if(intArray[i] < intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
            if(i==1) {
                break;
            }
        }
        for (int k = 0; k< intArray.length; k++) {
            System.out.println(intArray[k]);
        }
        System.out.println("second largest number is :" + intArray[1]);
    }

}
