import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] baskets = new int[N + 1];

        for (int op = 0; op < M; op++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for (int index = i; index <= j; index++) {
                baskets[index] = k;
            }
        }

        for (int index = 1; index <= N; index++) {
            System.out.print(baskets[index] + " ");
        }
        System.out.println();

        scanner.close();
    }
}