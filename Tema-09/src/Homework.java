import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {

            arr[i] = rand.nextInt(100) + 1;

        }

        System.out.println("\nArray:");
        printArray(arr);

        List<Integer> evenElements = new ArrayList<>();
        List<Integer> oddElements = new ArrayList<>();

        separateEvenOdd(arr, evenElements, oddElements);

        System.out.println("\nEven el:");
        printList(evenElements);
        System.out.println("\nOdd el:");
        printList(oddElements);

        bubbleSortAscending(evenElements);
        bubbleSortDescending(oddElements);

        System.out.println("\nEven el ascending:");
        printList(evenElements);
        System.out.println("\nOdd el descending:");
        printList(oddElements);
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

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printList(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}