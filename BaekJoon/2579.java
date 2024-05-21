import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        System.out.println(maxScore(n, scores));
    }

    public static int maxScore(int n, int[] scores) {
        if (n == 1) return scores[0];
        if (n == 2) return scores[0] + scores[1];

        int[] dp = new int[n];
        dp[0] = scores[0];
        dp[1] = scores[0] + scores[1];
        dp[2] = Math.max(scores[0] + scores[2], scores[1] + scores[2]);

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + scores[i], dp[i - 3] + scores[i - 1] + scores[i]);
        }

        return dp[n - 1];
    }
}