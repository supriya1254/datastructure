package Sorting;

/*
* first we divide the array in two part left and right with the help of mid
* then we will further divide left array
* then we start merging left
* then controller will divide the right array and follow the same process for merging
*
* reference url for understanding : https://www.youtube.com/watch?v=jlHkDBEumP0&ab_channel=Jenny%27slecturesCS%2FITNET%26JRF
* */

public class MergeSort2 {

    int[] array;
    int length;
    int[] tempArray;


    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        MergeSort2 ms = new MergeSort2();
        ms.sort(intArray);

        for (int i : intArray) {
            System.out.println(i + "");
        }

    }

    public void sort(int[] intArray) {

        this.array = intArray;
        this.length = intArray.length;
        this.tempArray = new int[length];
        divideArray(0, length - 1);
    }

    public void divideArray(int lowerIndex, int higherIndex) {

        if(lowerIndex<higherIndex) {

            int middle=lowerIndex+(higherIndex - lowerIndex)/2;

            divideArray(lowerIndex, middle);

            divideArray(middle+1, higherIndex);

            mergeArray(lowerIndex, middle, higherIndex);
        }
    }

    public void mergeArray(int lowerIndex, int middle, int higherIndex) {
        // copying existing array to temporary array
        // then compare temporary array elements
        //place then in original
        // places remaining elements as it is in original array

        for (int i = lowerIndex; i<=higherIndex; i++) {
            tempArray[i] = array[i];
        }

        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;

        while(i<=middle && j<=higherIndex) {
            if(tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }

        if(i>middle) {
            while(j<=higherIndex) {
            array[k] = tempArray[j];
            j++;
            k++;
        }
    }
        else {
            while(i<=middle) {
                array[k] = tempArray[i];
                i++;
                k++;
            }

        }
    }
}