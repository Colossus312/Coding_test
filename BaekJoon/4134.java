import java.util.Scanner;

public class Main {

    private static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static long findNextPrime(long n) {
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt(); // Number of test cases still fits in an int

        for (int i = 0; i < testCases; i++) {
            long n = scanner.nextLong(); // Use nextLong() to read large values
            System.out.println(findNextPrime(n));
        }
        scanner.close();
    }
}