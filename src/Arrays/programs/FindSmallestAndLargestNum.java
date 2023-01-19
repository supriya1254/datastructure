package Arrays.programs;

public class FindSmallestAndLargestNum {

    static void findNum(long arr[]) {
        long n = arr.length;
        long temp;

        for(int i = 0; i<n-1; i++) {

            for(int j = i+1; j<=n-1; j++) {

                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        // largest : 88
        // smallest : 1

        long[] arr = {2,55,1,88,9,30, 100, 6};
        long n = arr.length;
        findNum(arr);

        for (long i = 0; i< n ; i++) {
            System.out.println("print sorted arrays : " + arr[(int)i]);
        }

        System.out.println("largest : " + arr[(int)n-1]);
        System.out.println("smallest : " + arr[0]);



    }
}
