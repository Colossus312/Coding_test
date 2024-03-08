import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] digits = input.toCharArray();

        Arrays.sort(digits);

        for(int i = 0; i < digits.length / 2; i++) {
            char temp = digits[i];
            digits[i] = digits[digits.length - i - 1];
            digits[digits.length - i - 1] = temp;
        }

        String sortedNumber = new String(digits);

        System.out.println(sortedNumber);
    }
}