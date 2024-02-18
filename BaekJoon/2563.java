import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int paperCount = Integer.parseInt(br.readLine());
        boolean[][] drawingPaper = new boolean[100][100];

        for (int i = 0; i < paperCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int leftDistance = Integer.parseInt(st.nextToken());
            int bottomDistance = Integer.parseInt(st.nextToken());

            for (int x = leftDistance; x < leftDistance + 10; x++) {
                for (int y = bottomDistance; y < bottomDistance + 10; y++) {
                    drawingPaper[x][y] = true;
                }
            }
        }

        int blackArea = 0;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                if (drawingPaper[x][y]) {
                    blackArea++;
                }
            }
        }

        System.out.println(blackArea);
    }
}