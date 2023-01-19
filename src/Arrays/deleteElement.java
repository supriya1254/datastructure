package Arrays;

public class deleteElement {
    public static void main(String[] args) {

        int deleteElement = 30;
        int[] intArray = {10, 20, 30, 40, 50, 0};
        int length = intArray.length;

        for(int i = 0; i<length-1; i++) {
            {
               if(deleteElement == intArray[i]) {

                   for(int j = i; j<length-1; j++) {
                       intArray[j] = intArray[j+1];
                   }
                   break;

               }
            }
        }


        for(int k = 0; k<intArray.length; k++) {
            System.out.println("after shifting : :  " + intArray[k]);
        }
        }
}
