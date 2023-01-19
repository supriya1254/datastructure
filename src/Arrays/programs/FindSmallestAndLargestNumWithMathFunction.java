package Arrays.programs;

public class FindSmallestAndLargestNumWithMathFunction {

    long min, max;
    FindSmallestAndLargestNumWithMathFunction(long min, long max) {
        this.min = min;
        this.max = max;
    }
    static FindSmallestAndLargestNumWithMathFunction getMinMax(long a[], long n) {
        //Write your code here

        long max = Long.MIN_VALUE; // -9223372036854775808
        for(int i=0; i<n; i++){
            max = Math.max(max, a[i]);
        }
        long min = Long.MAX_VALUE; // 9223372036854775808
        for(int i=0; i<n; i++){
            min = Math.min(min, a[i]);
        }
        FindSmallestAndLargestNumWithMathFunction find = new FindSmallestAndLargestNumWithMathFunction(min, max);
        return find;
    }

    public static void main(String[] args) {

        // largest : 88
        // smallest : 1

        long[] arr = {10000, 345, 234, 21, 56789, 55, 6,888};
        long n = arr.length;
        FindSmallestAndLargestNumWithMathFunction getFind = getMinMax(arr, n);

        System.out.println("largest : " + getFind.max);
        System.out.println("smallest : " + getFind.min);


    }
}
