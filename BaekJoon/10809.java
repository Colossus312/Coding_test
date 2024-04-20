import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        int[] positions = new int[26];
        Arrays.fill(positions, -1);

        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            int index = currentChar - 'a';
            if (positions[index] == -1) {
                positions[index] = i;
            }
        }

        for (int pos : positions) {
            System.out.print(pos + " ");
        }

        scanner.close();
    }
}