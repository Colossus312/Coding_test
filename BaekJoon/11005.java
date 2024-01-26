import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        long N = Long.parseLong(input[0]);
        int B = Integer.parseInt(input[1]);

        System.out.println(convertToBase(N, B));
    }

    private static String convertToBase(long number, int base) {
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int remainder = (int)(number % base);
            if (remainder < 10) {
                result.append(remainder);
            } else {
                result.append((char)('A' + remainder - 10));
            }
            number /= base;
        }
        return result.reverse().toString();
    }
}