import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] sequence = new int[M];

        generateSequences(N, M, 1, 0, sequence);
    }

    private static void generateSequences(int N, int M, int start, int depth, int[] sequence) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(sequence[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {
            sequence[depth] = i;
            generateSequences(N, M, i + 1, depth + 1, sequence);
        }
    }
}