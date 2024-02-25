import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = reader.readLine().split(" ");
        int a1 = Integer.parseInt(firstLine[0]);
        int a0 = Integer.parseInt(firstLine[1]);

        int c = Integer.parseInt(reader.readLine());
        int n0 = Integer.parseInt(reader.readLine());

        if (satisfiesBigONotation(a1, a0, c, n0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static boolean satisfiesBigONotation(int a1, int a0, int c, int n0) {
        for (int n = n0; n <= 100; n++) {
            if (a1 * n + a0 > c * n) {
                return false;
            }
        }
        return true;
    }
}