import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        long numberOfExecutions = ((long) n * (n - 1) * (n - 2)) / 6;

        System.out.println(numberOfExecutions);

        System.out.println(3);
    }

}