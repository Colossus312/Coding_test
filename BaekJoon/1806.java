import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int[] sequence = new int[N];

        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }

        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < N; end++) {
            currentSum += sequence[end];

            while (currentSum >= S) {
                minLength = Math.min(minLength, end - start + 1);
                currentSum -= sequence[start];
                start++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }

        scanner.close();
    }
}
