import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        char[][] pattern = new char[N][N];
        generatePattern(pattern, N);

        printPattern(pattern, N);
    }

    private static void generatePattern(char[][] pattern, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                pattern[i][j] = '*';
            }
        }

        int n = size;
        while (n > 1) {
            int newSize = n / 3;
            for (int i = 0; i < size; i += n) {
                for (int j = 0; j < size; j += n) {
                    for (int k = 0; k < newSize; k++) {
                        for (int l = 0; l < newSize; l++) {
                            pattern[i + newSize + k][j + newSize + l] = ' ';
                        }
                    }
                }
            }
            n /= 3;
        }
    }

    private static void printPattern(char[][] pattern, int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(pattern[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}