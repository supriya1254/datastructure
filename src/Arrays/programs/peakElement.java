package Arrays.programs;


/*
* Peak element : its value is not smaller than the value of its adjacent elements.
*/
public class peakElement {

    public static int peakElement(int[] intArray, int n) {
        if (n == 0) {
            return 0;
        }

        if (intArray[0] >= intArray[1]) {
            return 0;
        }

        if (intArray[n - 1] >= intArray[n - 2]) {
            return n - 1;
        }

        for (int i = 1; i < n - 1; i++) {
            if (intArray[i] >= intArray[i - 1] && intArray[i] >= intArray[i + 1])
                return intArray[i];

        }
        return n;
    }

    public static void main(String[] args) {
        int[] intArray = {9,11,10};
        int i = peakElement(intArray, intArray.length);
        System.out.println(i);
    }
}
