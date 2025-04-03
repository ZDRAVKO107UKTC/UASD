package MergeSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class MergeSort_Methods {
    public static int[] MyArray;

    public static void input() throws IOException {
        System.out.println("Enter Number of elements: ");

        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(myReader.readLine());
        MyArray = new Random().ints(n, 1, 100).toArray();
    }

    public static void Mergesort(int[] myArray, int l, int r) {
        if (l < r) {
            int m = (r + l) / 2;

            Mergesort(myArray, l, m);
            Mergesort(myArray, m + 1, r);

            mergeSort(myArray, l, m, r);
        }
    }


    public static void mergeSort(int[] myArray, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int [] L= new int[n1];
        int [] R= new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = myArray[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = myArray[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                myArray[k] = L[i];
                i++;
            } else {
                myArray[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            myArray[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            myArray[k] = R[j];
            j++;
            k++;
        }

    }

    public static void print() {
        System.out.println(Arrays.toString(MyArray));
    }
}
