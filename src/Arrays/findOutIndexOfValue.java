package Arrays;


// want to find the index of 30
public class findOutIndexOfValue {
    public static void main(String[] args) {

        int arr[] = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 30 ) {
                index = i;
                break;
            }

        }

        System.out.print("index : : " + index) ;


    }
}
