import java.util.Scanner;

public class Main {
    private static int callCount;

    private static int recursion(String s, int l, int r) {
        callCount++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    private static int isPalindrome(String s) {
        callCount = 0;
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            String S = scanner.nextLine();
            int result = isPalindrome(S);
            System.out.println(result + " " + callCount);
        }

        scanner.close();
    }
}