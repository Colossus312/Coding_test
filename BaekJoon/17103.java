import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        boolean[] isPrime = new boolean[1000001];
        for (int i = 2; i <= 1000000; i++) isPrime[i] = true;
        for (int p = 2; p * p <= 1000000; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= 1000000; i += p) isPrime[i] = false;
            }
        }

        while (T-- > 0) {
            int N = scanner.nextInt();
            int count = 0;
            for (int i = 2; i <= N / 2; i++) {
                if (isPrime[i] && isPrime[N - i]) count++;
            }
            System.out.println(count);
        }
        scanner.close();
    }
}