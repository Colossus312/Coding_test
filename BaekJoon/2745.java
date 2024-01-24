import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        String number = input[0];
        int base = Integer.parseInt(input[1]);

        long decimalNumber = convertToDecimal(number, base);

        System.out.println(decimalNumber);
    }

    private static long convertToDecimal(String number, int base) {
        long decimalNumber = 0;
        int length = number.length();

        for (int i = 0; i < length; i++) {
            int digit = Character.digit(number.charAt(i), base);
            decimalNumber = decimalNumber * base + digit;
        }

        return decimalNumber;
    }
}