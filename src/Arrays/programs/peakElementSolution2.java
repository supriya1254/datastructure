package Arrays.programs;

class peakElementSolution2
{
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public static int peakElement(int[] arr,int n)
    {
        //add code here.

        int peakIndex=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                peakIndex=i-1;
                break;
            }
            else
                peakIndex=i;
        }
        return peakIndex;
    }

    public static void main(String args[]) {

        int[] arr = {9, 11, 10, 33, 75, 45};
        int i = peakElement(arr, arr.length);
        System.out.println(i);
    }
}
