import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int k = 0; k < M; k++) {
            int i = scanner.nextInt() - 1;
            int j = scanner.nextInt() - 1;
            reverseArray(baskets, i, j);
        }

        for (int num : baskets) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}