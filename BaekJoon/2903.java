import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int totalPoints = countPoints(n);
        System.out.println(totalPoints);
    }

    private static int countPoints(int n) {
        int pointsPerSide = 2;

        for (int i = 0; i < n; i++) {
            pointsPerSide = 2 * pointsPerSide - 1;
        }

        return pointsPerSide * pointsPerSide;
    }
}