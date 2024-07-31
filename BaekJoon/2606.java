import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int m = scanner.nextInt();

        List<List<Integer>> network = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            network.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            network.get(a).add(b);
            network.get(b).add(a);
        }

        boolean[] infected = new boolean[n + 1];

        int infectedCount = bfs(network, infected, 1);

        System.out.println(infectedCount - 1);

        scanner.close();
    }

    private static int bfs(List<List<Integer>> network, boolean[] infected, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        infected[start] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            count++;

            for (int neighbor : network.get(current)) {
                if (!infected[neighbor]) {
                    infected[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        return count;
    }
}
