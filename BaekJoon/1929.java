import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        boolean[] prime = new boolean[N + 1];

        for (int i = 0; i <= N; i++)
            prime[i] = true;

        for (int p = 2; p * p <= N; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= N; i += p)
                    prime[i] = false;
            }
        }

        for (int i = Math.max(M, 2); i <= N; i++) {
            if (prime[i]) {
                System.out.println(i);
            }
        }
    }
}