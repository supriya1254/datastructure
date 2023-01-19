package Sorting;

public class Factorial {
    public static void main(String[] args) {
      //  System.out.println(recursiveFactorial(6));

        System.out.println(iterativeFactorial(6));
    }

    public static int recursiveFactorial(int num) {

        //this if condition requires to break the method call once the num = 0, otherwise it will never stop.
        if(num == 0) {
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }


    //OR

    public static int iterativeFactorial (int num) {
        if(num == 0) {
            return 1;
        }

        int factorial = 1;

        for(int i = 1; i<= num; i ++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
