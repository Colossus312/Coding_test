import java.util.Scanner;

public class Main {

    private static boolean[] sieveOfEratosthenes(int maxLimit) {
        boolean[] isPrime = new boolean[maxLimit + 1];
        for (int i = 2; i <= maxLimit; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= maxLimit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= maxLimit; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] isPrime = sieveOfEratosthenes(246912);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            int primeCount = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime[i]) {
                    primeCount++;
                }
            }

            System.out.println(primeCount);
        }

        scanner.close();
    }
}