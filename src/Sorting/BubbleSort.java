package Sorting;

/*
 * Implementation :
 *       1. find last index
 *       2. then compare if i > i+1
 *       3. then swap largest with last index
 * */

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 55, 1, -22};

        for(int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0 ; lastUnsortedIndex --) {
            for (int i = 0; i < lastUnsortedIndex; i ++) {
                if(arr[i] > arr[i+1]) {
                    swap(arr, i, i + 1);
                }
            }
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
