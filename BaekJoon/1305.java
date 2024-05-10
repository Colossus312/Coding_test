import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String visiblePart = br.readLine();

        int minAdLength = getMinimumAdvertisementLength(visiblePart);
        System.out.println(length - minAdLength);
    }

    static int getMinimumAdvertisementLength(String visiblePart) {
        int[] pi = computePiArray(visiblePart);
        return pi[visiblePart.length() - 1];
    }

    static int[] computePiArray(String str) {
        int len = str.length();
        int[] pi = new int[len];
        int j = 0;

        for (int i = 1; i < len; i++) {
            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = pi[j - 1];
            }
            if (str.charAt(i) == str.charAt(j)) {
                pi[i] = ++j;
            }
        }

        return pi;
    }
}