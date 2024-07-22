import java.util.Scanner;

public class Main {
    public static String explodeString(String s, String explosive) {
        StringBuilder stack = new StringBuilder();
        int expLen = explosive.length();

        for (int i = 0; i < s.length(); i++) {
            stack.append(s.charAt(i));

            if (stack.length() >= expLen && stack.substring(stack.length() - expLen).equals(explosive)) {
                stack.delete(stack.length() - expLen, stack.length());
            }
        }

        if (stack.length() == 0) {
            return "FRULA";
        } else {
            return stack.toString();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine().trim();
        String explosive = scanner.nextLine().trim();

        System.out.println(explodeString(s, explosive));
    }
}
