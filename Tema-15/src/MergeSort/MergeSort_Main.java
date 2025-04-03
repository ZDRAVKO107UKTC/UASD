package MergeSort;

import java.io.IOException;

public class MergeSort_Main {
    public static void main(String[] args) throws IOException {
        MergeSort_Methods.input();
        System.out.println("Before sorting array:");
        MergeSort_Methods.print();
        MergeSort_Methods.Mergesort(MergeSort_Methods.MyArray,0,MergeSort_Methods.MyArray.length-1);
        System.out.println("Sorted array:");
        MergeSort_Methods.print();
    }
}

