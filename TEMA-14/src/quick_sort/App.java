package quick_sort;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        int[] arr = Utils.InputArray();
        System.out.println("Before sorting: \n");
        Utils.printArray(arr);
        Utils.quickSort(arr, 0, arr.length - 1);
        System.out.println("After sorting: \n");
        Utils.printArray(arr);

    }
}
