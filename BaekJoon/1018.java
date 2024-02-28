import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minRecolor = Integer.MAX_VALUE;
        for (int i = 0; i + 7 < N; i++) {
            for (int j = 0; j + 7 < M; j++) {
                minRecolor = Math.min(minRecolor, findMinRecolor(board, i, j));
            }
        }

        System.out.println(minRecolor);
    }

    private static int findMinRecolor(char[][] board, int x, int y) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[x + i][y + j] != 'W') count1++;
                    if (board[x + i][y + j] != 'B') count2++;
                } else {
                    if (board[x + i][y + j] != 'B') count1++;
                    if (board[x + i][y + j] != 'W') count2++;
                }
            }
        }
        return Math.min(count1, count2);
    }
}