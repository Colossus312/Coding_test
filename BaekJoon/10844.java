import java.util.Scanner;

public class Main {
    private static final int MOD = 1000000000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        System.out.println(countStepNumbers(N));
    }

    public static int countStepNumbers(int N) {
        if (N == 1) return 9;

        int[][] dp = new int[N + 1][10];

        for (int j = 1; j <= 9; j++) {
            dp[1][j] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                dp[i][j] = 0;
                if (j > 0) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MOD;
                }
                if (j < 9) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % MOD;
                }
            }
        }

        int result = 0;
        for (int j = 0; j <= 9; j++) {
            result = (result + dp[N][j]) % MOD;
        }

        return result;
    }
}