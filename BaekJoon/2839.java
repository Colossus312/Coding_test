import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = minBags(N);

        System.out.println(result);
    }

    private static int minBags(int N) {
        for (int fiveKgBags = N / 5; fiveKgBags >= 0; fiveKgBags--) {
            int remaining = N - (fiveKgBags * 5);

            if (remaining % 3 == 0) {
                return fiveKgBags + (remaining / 3);
            }
        }

        return -1;
    }
}