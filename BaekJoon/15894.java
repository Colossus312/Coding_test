import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            long n = Long.parseLong(reader.readLine());
            System.out.print(4 * n);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}