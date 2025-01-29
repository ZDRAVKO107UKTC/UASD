package selection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Utils {
    public static int[] inputs() throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Въведете размер на масива N: ");
    int N = Integer.parseInt(reader.readLine());

    int[] array = new int[N];
    Random random = new Random();
        for (int i = 0; i < N; i++) {
        array[i] = random.nextInt(101);
    }
        return array;



    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void selection_sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

    }
}
