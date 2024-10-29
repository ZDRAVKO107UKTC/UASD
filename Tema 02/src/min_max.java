import java.util.Arrays;
import java.util.Random;

public class min_max {
    public static void main(String[] args) {

        System.out.println("\nFind Min and Max!!!");

        int n  = 10;
        int[] arr = new Random().ints(n, 1, 50).toArray();

        int min = arr[0];
        int max = arr[0];
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < n; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }// end of if min

            if(arr[i] > max) {
                max = arr[i];
            }//end of if max

        }// end of for

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }// end of main
}// end of class
