import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();

        String[] subtractParts = expression.split("-");
        int result = sum(subtractParts[0]);

        for (int i = 1; i < subtractParts.length; i++) {
            result -= sum(subtractParts[i]);
        }

        System.out.println(result);
    }

    private static int sum(String part) {
        String[] addParts = part.split("\\+");
        int sum = 0;
        for (String p : addParts) {
            sum += Integer.parseInt(p);
        }
        return sum;
    }
}
