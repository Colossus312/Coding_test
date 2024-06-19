import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] memory = new int[N];
        int[] cost = new int[N];

        for (int i = 0; i < N; i++) {
            memory[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            cost[i] = scanner.nextInt();
        }

        int maxCost = 100 * N;

        int[] dp = new int[maxCost + 1];

        for (int i = 0; i <= maxCost; i++) {
            dp[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            for (int j = maxCost; j >= cost[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - cost[i]] + memory[i]);
            }
        }

        int result = 0;
        for (int i = 0; i <= maxCost; i++) {
            if (dp[i] >= M) {
                result = i;
                break;
            }
        }

        System.out.println(result);

        scanner.close();
    }
}