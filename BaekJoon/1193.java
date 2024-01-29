import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int diagonal = 1, count = 0;

        while (count < X) {
            count += diagonal;
            diagonal++;
        }

        diagonal--;
        count -= diagonal;

        int numerator, denominator;
        if (diagonal % 2 == 0) {
            numerator = X - count;
            denominator = diagonal - numerator + 1;
        } else {
            denominator = X - count;
            numerator = diagonal - denominator + 1;
        }

        System.out.println(numerator + "/" + denominator);
    }
}