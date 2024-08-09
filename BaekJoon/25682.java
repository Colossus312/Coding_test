import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nmks = br.readLine().split(" ");
        int N = Integer.parseInt(nmks[0]);
        int M = Integer.parseInt(nmks[1]);
        int K = Integer.parseInt(nmks[2]);

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int[][] changesWhite = new int[N + 1][M + 1];
        int[][] changesBlack = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                char expectedWhite = ((i + j) % 2 == 0) ? 'W' : 'B';
                char expectedBlack = ((i + j) % 2 == 0) ? 'B' : 'W';

                changesWhite[i][j] = changesWhite[i-1][j] + changesWhite[i][j-1] - changesWhite[i-1][j-1] + (board[i-1][j-1] != expectedWhite ? 1 : 0);
                changesBlack[i][j] = changesBlack[i-1][j] + changesBlack[i][j-1] - changesBlack[i-1][j-1] + (board[i-1][j-1] != expectedBlack ? 1 : 0);
            }
        }

        int minChanges = Integer.MAX_VALUE;

        for (int i = K; i <= N; i++) {
            for (int j = K; j <= M; j++) {
                int totalWhite = changesWhite[i][j] - changesWhite[i-K][j] - changesWhite[i][j-K] + changesWhite[i-K][j-K];
                int totalBlack = changesBlack[i][j] - changesBlack[i-K][j] - changesBlack[i][j-K] + changesBlack[i-K][j-K];
                int changes = Math.min(totalWhite, totalBlack);

                if (changes < minChanges) {
                    minChanges = changes;
                }
            }
        }

        System.out.println(minChanges);
    }
}
