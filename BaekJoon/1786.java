import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int[] computeLPSArray(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int length = 0;
        int i = 1;
        lps[0] = 0;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];

                } else {
                    lps[i] = length;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void KMP(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int[] lps = computeLPSArray(pattern);

        ArrayList<Integer> matches = new ArrayList<>();
        int j = 0;
        int i = 0;

        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                j++;
                i++;
            }
            if (j == m) {
                matches.add(i - j + 1);
                j = lps[j - 1];
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }

        System.out.println(matches.size());
        if (!matches.isEmpty()) {
            for (int pos : matches) {
                System.out.print(pos + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String T = scanner.nextLine();
        String P = scanner.nextLine();
        scanner.close();

        KMP(T, P);
    }
}