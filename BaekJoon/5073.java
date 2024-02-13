import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = reader.readLine()) != null && !line.equals("0 0 0")) {
            String[] parts = line.split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            int c = Integer.parseInt(parts[2]);

            System.out.println(classifyTriangle(a, b, c));
        }
    }

    private static String classifyTriangle(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Invalid";
        }

        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || a == c || b == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
