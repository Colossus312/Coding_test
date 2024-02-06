import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String inputA = reader.readLine();
            int A = Integer.parseInt(inputA);

            String inputB = reader.readLine();
            int B = Integer.parseInt(inputB);

            int area = A * B;

            System.out.println(area);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}