import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            String result = generateCantorSet(N);
            System.out.println(result);
        }

        sc.close();
    }

    private static String generateCantorSet(int N) {
        int length = (int) Math.pow(3, N);
        char[] cantorSet = new char[length];
        for (int i = 0; i < length; i++) {
            cantorSet[i] = '-';
        }

        removeMiddle(cantorSet, 0, length);

        return new String(cantorSet);
    }

    private static void removeMiddle(char[] cantorSet, int start, int length) {
        if (length < 3) {
            return;
        }

        int third = length / 3;

        for (int i = start + third; i < start + 2 * third; i++) {
            cantorSet[i] = ' ';
        }

        removeMiddle(cantorSet, start, third);
        removeMiddle(cantorSet, start + 2 * third, third);
    }
}