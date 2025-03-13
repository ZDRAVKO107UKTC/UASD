package quick_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Utils {
    static int[] InputArray() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 8192);
        System.out.println("Enter size of arr: ");
            int n = Integer.parseInt(reader.readLine());
        return (new Random()).ints((long)n, 0, 100).toArray();

    }
    static void printArray(int[] arr){
        System.out.println("Array");
        System.out.println(Arrays.toString(arr));
    }

    static int partition(int[] arr, int high, int low){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i + 1;
    }


    static void quickSort(int[] arr, int low, int high){
        if (low < high) {
            int pi = partition(arr, high, low);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
