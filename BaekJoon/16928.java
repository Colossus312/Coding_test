import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] board = new int[101];
        for (int i = 1; i <= 100; i++) {
            board[i] = i;
        }

        for (int i = 0; i < N; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            board[start] = end;
        }

        for (int i = 0; i < M; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            board[start] = end;
        }

        System.out.println(minDiceRolls(board));
        scanner.close();
    }

    private static int minDiceRolls(int[] board) {
        boolean[] visited = new boolean[101];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;

        int rolls = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            rolls++;

            for (int i = 0; i < size; i++) {
                int current = queue.poll();

                for (int dice = 1; dice <= 6; dice++) {
                    int next = current + dice;

                    if (next > 100) continue;

                    next = board[next];

                    if (next == 100) return rolls;

                    if (!visited[next]) {
                        visited[next] = true;
                        queue.add(next);
                    }
                }
            }
        }

        return -1;
    }
}
