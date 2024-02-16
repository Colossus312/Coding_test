import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxVal = -1;
        int maxRow = -1;
        int maxCol = -1;

        for (int row = 0; row < 9; row++) {
            String[] line = br.readLine().trim().split(" ");
            for (int col = 0; col < 9; col++) {
                int val = Integer.parseInt(line[col]);
                if (val > maxVal) {
                    maxVal = val;
                    maxRow = row + 1;
                    maxCol = col + 1;
                }
            }
        }

        System.out.println(maxVal);
        System.out.println(maxRow + " " + maxCol);
    }
}