import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < T; i++) {
            String input = scanner.nextLine();

            int firstSpaceIndex = input.indexOf(' ');
            int R = Integer.parseInt(input.substring(0, firstSpaceIndex));
            String S = input.substring(firstSpaceIndex + 1);

            StringBuilder P = new StringBuilder();
            for (char c : S.toCharArray()) {
                for (int j = 0; j < R; j++) {
                    P.append(c);
                }
            }

            System.out.println(P);
        }

        scanner.close();
    }
}