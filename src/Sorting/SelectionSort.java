package Sorting;

/*
* Implementation :
*       1. find last index
*       2. declare a largest value as a 0
*       3. then compare if i > i+1
*       4. then swap largest with last index
* */

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0 ; lastUnsortedIndex --) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i ++) {

                if (arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            swap(arr, largest, lastUnsortedIndex);
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] +  ",");
        }
    }

    public static void swap (int array[], int i, int j) {
        if(i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}