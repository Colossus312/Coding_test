import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            String input = scanner.nextLine();

            char firstChar = input.charAt(0);
            char lastChar = input.charAt(input.length() - 1);

            System.out.println(firstChar + "" + lastChar);
        }

        scanner.close();
    }
}