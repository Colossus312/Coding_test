import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] balloons = new int[N];
        boolean[] popped = new boolean[N];

        for (int i = 0; i < N; i++) {
            balloons[i] = scanner.nextInt();
        }

        int currentIndex = 0;
        for (int i = 0; i < N; i++) {
            if (i > 0) {
                int steps = balloons[currentIndex];
                int direction = steps > 0 ? 1 : -1;
                while (steps != 0) {
                    currentIndex = (currentIndex + direction + N) % N;
                    if (!popped[currentIndex]) {
                        steps -= direction;
                    }
                }
            }

            popped[currentIndex] = true;
            System.out.print((currentIndex + 1) + " ");
        }
    }
}