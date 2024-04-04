import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] queue = new int[N];
        for (int i = 0; i < N; i++) {
            queue[i] = scanner.nextInt();
        }

        Stack<Integer> sideTable = new Stack<>();
        int expected = 1;
        for (int i = 0; i < N; i++) {
            while (!sideTable.isEmpty() && sideTable.peek() == expected) {
                sideTable.pop();
                expected++;
            }

            if (queue[i] == expected) {
                expected++;
            } else {
                sideTable.push(queue[i]);
            }
        }

        while (!sideTable.isEmpty() && sideTable.peek() == expected) {
            sideTable.pop();
            expected++;
        }

        if (expected - 1 == N) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}