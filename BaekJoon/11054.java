import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int[] inc = new int[N];
        int[] dec = new int[N];

        for (int i = 0; i < N; i++) {
            inc[i] = 1;
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i] && inc[i] < inc[j] + 1) {
                    inc[i] = inc[j] + 1;
                }
            }
        }

        for (int i = N - 1; i >= 0; i--) {
            dec[i] = 1;
            for (int j = N - 1; j > i; j--) {
                if (A[j] < A[i] && dec[i] < dec[j] + 1) {
                    dec[i] = dec[j] + 1;
                }
            }
        }

        int maxLen = 0;
        for (int i = 0; i < N; i++) {
            if (maxLen < inc[i] + dec[i] - 1) {
                maxLen = inc[i] + dec[i] - 1;
            }
        }

        System.out.println(maxLen);

        scanner.close();
    }
}