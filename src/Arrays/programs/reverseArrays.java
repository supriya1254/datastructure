package Arrays.programs;

public class reverseArrays {

    static void reverse(int a[], int n) {

        int b[] = new int[n];
        int j = n;

        for(int i = 0; i<n; i++){
            b[j-1] = a[i];
            j--;
        }

        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.print(b[k] + " ");
        }
    }



    public static void main (String[] args) {

        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        reverse(arr,n);

    }
}
