import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = reader.readLine().split(" ");

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);
        int d = Integer.parseInt(inputs[3]);
        int e = Integer.parseInt(inputs[4]);
        int f = Integer.parseInt(inputs[5]);

        int det = a * e - b * d;

        int x = (c * e - b * f) / det;
        int y = (a * f - c * d) / det;

        System.out.println(x + " " + y);

    }
}