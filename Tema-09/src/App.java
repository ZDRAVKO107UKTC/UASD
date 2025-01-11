
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {

            arr[i] = rand.nextInt(100) + 1;

        }
        System.out.println("Първоначален масив: ");
        printArray(arr);

        Util.bubble_sort_for(arr);
        System.out.println("\nСортиран масив с bubble_sort_for:");
        printArray(arr);


        for (int i = 0; i < n; i++) {

            arr[i] = rand.nextInt(100) + 1;  // Случайни стойности от 1 до 100

        }


        System.out.println("\nПървоначален масив:");
        printArray(arr);
        Util.bubble_Sort_While(arr);
        System.out.println("\nСортиран масив с bubble_sort_while:");
        printArray(arr);

    }


    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

    }

}




