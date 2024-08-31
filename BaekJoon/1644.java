import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        int count = 0;
        int start = 0, end = 0, sum = 0;

        while (end < primes.size()) {
            if (sum < N) {
                sum += primes.get(end);
                end++;
            }
            while (sum >= N) {
                if (sum == N) {
                    count++;
                }
                sum -= primes.get(start);
                start++;
            }
        }

        System.out.println(count);
    }
}
