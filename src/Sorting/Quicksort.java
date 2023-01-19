package Sorting;


/*
* for partition,
* we need to find pivot = array[(low+high)/2], because we need middle element
* then we get two array left and right
* then we compare left < pivot and right > pivot
* then we swap
*
* for recursion,
* now we have to sub array, and we again need to follow the partition logic for both the sub array
*
*
* */
public class Quicksort {
    public static void main(String[] args) {
        int[] intArray = {7,6,10,5,9,2,1,15,7};
        int length = intArray.length;

        quickSortRecursion(intArray, 0, length-1);
        printArray(intArray);
    }

    static int partitionArray(int[] intArray, int low, int high) {

        int pivot = intArray[(low+high)/2];

        while(low<high) {
            if(intArray[low] < pivot) {
                low++;
            }
            if(intArray[high] > pivot) {
                high--;
            }

            if(low <= high) {
                int temp = intArray[low];
                intArray[low] = intArray[high];
                intArray[high] = temp;

                low++;
                high--;
            }
        }

        return low;

    }

    static void quickSortRecursion(int[] intArray, int low, int high) {

        int pi = partitionArray(intArray, low, high);

        if(low < pi-1) {
            quickSortRecursion(intArray, low, pi-1);
        }

        if(high > pi) {
            quickSortRecursion(intArray, pi, high);
        }

    }



    static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}
