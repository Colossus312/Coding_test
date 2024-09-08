import java.util.*;

public class Main {
    static int MAX = 100000;
    static int[] visited = new int[MAX + 1];
    static int[] path = new int[MAX + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (N == K) {
            System.out.println(0);
            System.out.println(N);
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        visited[N] = 1;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : new int[]{current - 1, current + 1, current * 2}) {
                if (next >= 0 && next <= MAX && visited[next] == 0) {
                    visited[next] = visited[current] + 1;
                    path[next] = current;
                    queue.offer(next);
                    if (next == K) {
                        System.out.println(visited[next] - 1);
                        printPath(N, K);
                        return;
                    }
                }
            }
        }
    }

    static void printPath(int start, int end) {
        Stack<Integer> stack = new Stack<>();
        for (int i = end; i != start; i = path[i]) {
            stack.push(i);
        }
        stack.push(start);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
