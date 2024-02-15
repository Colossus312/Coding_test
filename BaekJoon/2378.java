import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = reader.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        int[][] matrixA = new int[N][M];
        int[][] matrixB = new int[N][M];
        int[][] resultMatrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] row = reader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = Integer.parseInt(row[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            String[] row = reader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                matrixB[i][j] = Integer.parseInt(row[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}