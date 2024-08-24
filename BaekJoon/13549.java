import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        if (N == K) {
            System.out.println(0);
            return;
        }

        int[] time = new int[100001];
        for (int i = 0; i < time.length; i++) {
            time[i] = -1;
        }

        Deque<Integer> deque = new LinkedList<>();
        deque.add(N);
        time[N] = 0;

        while (!deque.isEmpty()) {
            int current = deque.poll();

            int[] nextPositions = {current * 2, current - 1, current + 1};

            for (int i = 0; i < 3; i++) {
                int next = nextPositions[i];

                if (next >= 0 && next <= 100000 && time[next] == -1) {
                    if (i == 0) {
                        time[next] = time[current];
                        deque.addFirst(next);
                    } else {
                        time[next] = time[current] + 1;
                        deque.addLast(next);
                    }
                }

                if (next == K) {
                    System.out.println(time[next]);
                    return;
                }
            }
        }
    }
}
