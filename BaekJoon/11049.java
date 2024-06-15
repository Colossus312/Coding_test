import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] dimensions = new int[n + 1];

        for (int i = 0; i < n; i++) {
            dimensions[i] = scanner.nextInt();
            dimensions[i + 1] = scanner.nextInt();
        }

        int[][] dp = new int[n][n];

        for (int l = 2; l <= n; l++) {
            for (int i = 0; i < n - l + 1; i++) {
                int j = i + l - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int q = dp[i][k] + dp[k + 1][j] + dimensions[i] * dimensions[k + 1] * dimensions[j + 1];
                    if (q < dp[i][j]) {
                        dp[i][j] = q;
                    }
                }
            }
        }

        System.out.println(dp[0][n - 1]);
    }
}