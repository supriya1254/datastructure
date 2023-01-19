package Arrays.programs;

/*
* 1. we initialize two variable with smallest value of Integer i.e Integer.MIN_VALUE = -2147483648
* 2. largest = Integer.MIN_VALUE = -2147483648 and second_largest = Integer.MIN_VALUE
* 3. then we compare the variable 'largest' with each element of array
* 4. if we find the one then we put the largest value to second largest
* 5. then we finally check if the second_largest != largest and is greater the element we found in array
* */

public class secondLargestNumber2 {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30, 1, 3, 100};

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i = 0; i < intArray.length; i++) {
            if(intArray[i] > largest) {
                second_largest = largest;
                largest = intArray[i];
            } else if(intArray[i] > second_largest && intArray[i] != largest) {
                second_largest = intArray[i];
            }
        }
        System.out.println("second largest value : " + second_largest);
    }

}
