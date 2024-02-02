import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = reader.readLine()).equals("-1")) {
            int n = Integer.parseInt(line);
            checkAndPrintPerfectNumber(n);
        }
    }

    private static void checkAndPrintPerfectNumber(int n) {
        int sum = 0;
        StringBuilder divisors = new StringBuilder();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
                if (divisors.length() > 0) {
                    divisors.append(" + ");
                }
                divisors.append(i);
            }
        }

        if (sum == n) {
            System.out.println(n + " = " + divisors);
        } else {
            System.out.println(n + " is NOT perfect.");
        }
    }
}