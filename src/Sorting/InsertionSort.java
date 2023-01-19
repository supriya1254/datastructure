package Sorting;

/*
* Implementation : first shift then insert
*   1. first element is sorted element
*   2. so we start from index 1, line : 14
*   3. we assign the value of the index that we want to sort in newElement
*   4. then we will compare the newElement with all the left elements
*   5. the shifting we happen right to left
*   6. then we will set the new Element value to ith position
* */

public class InsertionSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
             firstUnsortedIndex++) {

            int newElement = intArray[firstUnsortedIndex];

            int i;

            for ( i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}

