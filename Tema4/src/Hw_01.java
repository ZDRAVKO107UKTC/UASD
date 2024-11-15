import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw_01 {

    public static int arr_MAX(int[] A) {
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array:");

        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter the elements of the array:");

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("The array is: ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // To move to a new line

        int max = arr_MAX(arr);

        System.out.println("The maximum value in the array is: " + max);
    }
}
