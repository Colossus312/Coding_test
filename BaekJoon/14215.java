import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int[] sticks = new int[3];
        for (int i = 0; i < 3; i++) {
            sticks[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(sticks);

        while (sticks[0] + sticks[1] <= sticks[2]) {
            sticks[2]--;
        }

        int perimeter = sticks[0] + sticks[1] + sticks[2];
        System.out.println(perimeter);
    }
}