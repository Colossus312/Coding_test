import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] seq = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            seq[i] = sc.nextInt();
        }

        int[] D = new int[N + 1];
        D[1] = seq[1];

        for (int i = 2; i <= N; i++) {
            D[i] = Math.max(D[i - 1] + seq[i], seq[i]);
        }

        int maxSum = D[1];
        for (int i = 2; i <= N; i++) {
            if (D[i] > maxSum) {
                maxSum = D[i];
            }
        }

        System.out.println(maxSum);
    }
}