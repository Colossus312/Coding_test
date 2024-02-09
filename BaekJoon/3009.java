import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] points = new int[3][2];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        int x, y;
        if (points[0][0] == points[1][0]) {
            x = points[2][0];
        } else if (points[0][0] == points[2][0]) {
            x = points[1][0];
        } else {
            x = points[0][0];
        }

        if (points[0][1] == points[1][1]) {
            y = points[2][1];
        } else if (points[0][1] == points[2][1]) {
            y = points[1][1];
        } else {
            y = points[0][1];
        }

        System.out.println(x + " " + y);
    }
}