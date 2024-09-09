import java.util.*;

public class Main {

    static class Node {
        int value;
        String command;

        public Node(int value, String command) {
            this.value = value;
            this.command = command;
        }
    }

    static int D(int n) {
        return (2 * n) % 10000;
    }

    static int S(int n) {
        return (n == 0) ? 9999 : n - 1;
    }

    static int L(int n) {
        return (n % 1000) * 10 + (n / 1000);
    }

    static int R(int n) {
        return (n % 10) * 1000 + (n / 10);
    }

    public static String bfs(int start, int target) {
        boolean[] visited = new boolean[10000];
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(start, ""));
        visited[start] = true;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.value == target) {
                return current.command;
            }

            int[] nextValues = { D(current.value), S(current.value), L(current.value), R(current.value) };
            char[] commands = { 'D', 'S', 'L', 'R' };

            for (int i = 0; i < 4; i++) {
                if (!visited[nextValues[i]]) {
                    visited[nextValues[i]] = true;
                    queue.offer(new Node(nextValues[i], current.command + commands[i]));
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(bfs(A, B));
        }
        scanner.close();
    }
}
