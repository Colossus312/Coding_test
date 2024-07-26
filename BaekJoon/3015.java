import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] heights = new long[N];
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextLong();
        }

        Stack<Pair> stack = new Stack<>();
        long count = 0;

        for (int i = 0; i < N; i++) {
            long currentHeight = heights[i];
            int sameHeightCount = 0;

            while (!stack.isEmpty() && stack.peek().height <= currentHeight) {
                Pair top = stack.pop();
                count += top.count;
                if (top.height == currentHeight) {
                    sameHeightCount = top.count;
                }
            }

            if (!stack.isEmpty()) {
                count++;
            }

            if (sameHeightCount > 0) {
                stack.push(new Pair(currentHeight, sameHeightCount + 1));
            } else {
                stack.push(new Pair(currentHeight, 1));
            }
        }

        System.out.println(count);

        scanner.close();
    }

    private static class Pair {
        long height;
        int count;

        Pair(long height, int count) {
            this.height = height;
            this.count = count;
        }
    }
}
