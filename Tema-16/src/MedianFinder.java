import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MedianFinder {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        ArrayList<Double> numbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {

            numbers.add(Double.parseDouble(reader.readLine()));

        }

        Collections.sort(numbers);

        double median;
        if (N % 2 == 1) {

            median = numbers.get(N / 2);

        } else {

            median = (numbers.get(N / 2 - 1) + numbers.get(N / 2)) / 2.0;
        }

        System.out.println(median);
    }

}
