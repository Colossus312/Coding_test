import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void generatePermutations(int[] arr, boolean[] used, int depth, int M, int[] current) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(current[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current[depth] = arr[i];
                generatePermutations(arr, used, depth + 1, M, current);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        boolean[] used = new boolean[N];
        int[] current = new int[M];

        generatePermutations(arr, used, 0, M, current);
    }
}
