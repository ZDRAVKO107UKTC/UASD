package selection;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        int[] numbers = Utils.inputs();

        System.out.println("Масивът преди сортиране:");
        Utils.printArray(numbers);

        Utils.selection_sort(numbers);

        System.out.println("\nМасивът след сортиране:");
        Utils.printArray(numbers);
    }
}
