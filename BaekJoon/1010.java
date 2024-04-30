import java.util.Scanner;

public class Main {

    private static long combinations(int m, int n) {
        long[] C = new long[n + 1];
        C[0] = 1;

        for (int i = 1; i <= m; i++) {
            for (int j = Math.min(i, n); j > 0; j--) {
                C[j] = C[j] + C[j - 1];
            }
        }
        return C[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            System.out.println(combinations(M, N));
        }

        scanner.close();
    }
}
