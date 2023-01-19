package Arrays.programs;

public class reverseArraysWithSwapping {

    static void reverse(int a[], int n) {

        for(int i = 0; i<n; i++){
            int temp = a[i];
            a[i] = a[n-1];
            a[n-1] = temp;
            n--;
        }
    }



    public static void main (String[] args) {

        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        reverse(arr,n);

        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}
