import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        String[] numbers = reader.readLine().split(" ");

        int primeCount = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(numbers[i]);
            if (isPrime(num)) {
                primeCount++;
            }
        }

        System.out.println(primeCount);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}