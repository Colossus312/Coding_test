import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            int change = Integer.parseInt(reader.readLine());

            int quarters = change / 25;
            change %= 25;

            int dimes = change / 10;
            change %= 10;

            int nickels = change / 5;
            change %= 5;

            int pennies = change;

            System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
        }
    }
}