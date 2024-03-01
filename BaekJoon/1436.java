import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int number = 666;

        while (true) {
            if (containsThreeConsecutiveSixes(number)) {
                count++;
                if (count == N) {
                    System.out.println(number);
                    break;
                }
            }
            number++;
        }
    }

    private static boolean containsThreeConsecutiveSixes(int number) {
        String numStr = Integer.toString(number);
        return numStr.contains("666");
    }
}