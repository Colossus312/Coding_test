import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (N >= K) {
            System.out.println(N - K);
            return;
        }

        int[] time = new int[100001];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == K) {
                System.out.println(time[current]);
                return;
            }

            if (current - 1 >= 0 && time[current - 1] == 0) {
                time[current - 1] = time[current] + 1;
                queue.add(current - 1);
            }

            if (current + 1 <= 100000 && time[current + 1] == 0) {
                time[current + 1] = time[current] + 1;
                queue.add(current + 1);
            }

            if (current * 2 <= 100000 && time[current * 2] == 0) {
                time[current * 2] = time[current] + 1;
                queue.add(current * 2);
            }
        }
    }
}
