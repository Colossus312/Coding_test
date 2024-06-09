import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] sequence = new int[M];
        StringBuilder result = new StringBuilder();

        generateSequences(N, M, 0, 1, sequence, result);
        System.out.print(result.toString());
    }

    private static void generateSequences(int N, int M, int depth, int start, int[] sequence, StringBuilder result) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                result.append(sequence[i]).append(' ');
            }
            result.append('\n');
            return;
        }

        for (int i = start; i <= N; i++) {
            sequence[depth] = i;
            generateSequences(N, M, depth + 1, i, sequence, result);
        }
    }
}