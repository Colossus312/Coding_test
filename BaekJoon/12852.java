import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        int[] parent = new int[n + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n] = 0;

        for (int i = n; i > 1; i--) {
            if (dp[i] < Integer.MAX_VALUE) {
                if (i % 3 == 0 && dp[i / 3] > dp[i] + 1) {
                    dp[i / 3] = dp[i] + 1;
                    parent[i / 3] = i;
                }
                if (i % 2 == 0 && dp[i / 2] > dp[i] + 1) {
                    dp[i / 2] = dp[i] + 1;
                    parent[i / 2] = i;
                }
                if (dp[i - 1] > dp[i] + 1) {
                    dp[i - 1] = dp[i] + 1;
                    parent[i - 1] = i;
                }
            }
        }

        System.out.println(dp[1]);

        List<Integer> path = new ArrayList<>();
        for (int i = 1; i != n; i = parent[i]) {
            path.add(i);
        }
        path.add(n);
        Collections.reverse(path);
        for (int i : path) {
            System.out.print(i + " ");
        }
    }
}
