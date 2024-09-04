import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int[] dp = new int[N];
        int[] prev = new int[N];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxLength = 1;
        int lastIndex = 0;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                lastIndex = i;
            }
        }

        System.out.println(maxLength);
        List<Integer> lis = new ArrayList<>();
        for (int i = lastIndex; i >= 0; i = prev[i]) {
            lis.add(A[i]);
            if (prev[i] == -1) break;
        }
        Collections.reverse(lis);
        for (int num : lis) {
            System.out.print(num + " ");
        }
    }
}
