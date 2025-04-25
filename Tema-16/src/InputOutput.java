import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(br.readLine()));
        }

        for (int numbers : nums){
            System.out.println(numbers + " ");
        }
        System.out.println();
        System.out.println(nums.size());

    }
}
