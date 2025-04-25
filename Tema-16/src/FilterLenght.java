import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class FilterLenght {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            words.add(reader.readLine());
        }

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.length() % 2 != 0) {
                iterator.remove();
            }
        }

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}