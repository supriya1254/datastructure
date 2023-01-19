package Sorting;

/*
*  Implementation :
* - we need to two methods, one for divide and another one for conquer
* - we need array, first index, last index
* - then we will find midpoint = (start + end) /2
*
* */

public class MergeSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void mergeSort(int[] input, int start, int end) {

        //1. here first we need breaking condition
        if(end - start <2) {
            return;
        }

        // 2. now we need to partition the array
        int mid = (start + end)/2;

        // 3. now we need to do a merge sort on the left partition
        mergeSort(input, start, mid);

        // 4. now we need to handle the right part of the array
        mergeSort(input, mid, end);

        // 5. now we merge sorted partition
        merge(input, start, mid, end);
    }


    public static void merge(int[] input, int start, int mid, int end) {

        // case 1
        // the below condition means, we call this 'merge method' on the sorted array
        // so if the last element of left array is less than and equals to first element of right array then we are done. no need to merge and we will get the sorted array.
        // and then final we will copy the left sorted array and right sorted array into the temporary array.
        // and then we will copy the merged array back to the original array
        if(input[mid-1] <= input[mid]) {
            return;
        }

        // Case 2, if the case 1 is not there
        // meaning we have some elements in left array which is greater than the elements in right array
        // then we need to merge and put them in a right order
        int i = start;
        int j = mid;
        int tempIndex = 0; // (this will track of where we are in temporary array)

        // temporary array
        int[] temp = new int[end - start];

        // then we start compare with whatever is at index i in the left array and
        // whatever is at index j in the right array
        while(i < mid && j < end ) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++] ;
        }


        // we are handling the remaining elements
        // if there are elements left over in left array then only we need to handle because there might be some elements which are greater, and we need to put in tht right order
        // but there are left over elements in right array then don't have to do anything because their position in the original array aren't going change.
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
