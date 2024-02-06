import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        for (int factor = 2; factor * factor <= N; factor++) {
            while (N % factor == 0) {
                System.out.println(factor);
                N /= factor;
            }
        }
        if (N > 1) {
            System.out.println(N);
        }
    }
}