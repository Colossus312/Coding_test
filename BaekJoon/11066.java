import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int K = Integer.parseInt(br.readLine());
            int[] files = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            System.out.println(minCostToMergeFiles(files, K));
        }
    }

    private static int minCostToMergeFiles(int[] files, int K) {
        int[][] dp = new int[K][K];
        int[] prefixSum = new int[K];

        prefixSum[0] = files[0];
        for (int i = 1; i < K; i++) {
            prefixSum[i] = prefixSum[i-1] + files[i];
        }

        for (int len = 2; len <= K; len++) {
            for (int i = 0; i <= K - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k+1][j] + sum(prefixSum, i, j);
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }

        return dp[0][K-1];
    }

    private static int sum(int[] prefixSum, int i, int j) {
        if (i == 0) {
            return prefixSum[j];
        }
        return prefixSum[j] - prefixSum[i-1];
    }
}