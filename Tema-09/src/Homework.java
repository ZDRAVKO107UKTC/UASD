import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements in the array: ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        System.out.println("\nArray: " + Arrays.toString(arr));

        List<Integer> evenElements = new ArrayList<>();
        List<Integer> oddElements = new ArrayList<>();

        separateEvenOdd(arr, evenElements, oddElements);

        System.out.println("\nEven el: " + Arrays.toString(evenElements.toArray()));
        System.out.println("\nOdd el: " + Arrays.toString(oddElements.toArray()));

        bubbleSortAscending(evenElements);
        bubbleSortDescending(oddElements);

        System.out.println("\nEven el ascending: " + Arrays.toString(evenElements.toArray()));
        System.out.println("\nOdd el descending: " + Arrays.toString(oddElements.toArray()));

    }

    public static void separateEvenOdd(int[] arr, List<Integer> evenElements, List<Integer> oddElements) {
        for (int num : arr) {
            if (num % 2 == 0) {
                evenElements.add(num);
            } else {
                oddElements.add(num);
            }
        }
    }

    public static void bubbleSortAscending(List<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    public static void bubbleSortDescending(List<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) < arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

}