import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        for (int k = 0; k < K; k++) {
            int V = scanner.nextInt();
            int E = scanner.nextInt();

            List<Integer>[] graph = new ArrayList[V + 1];
            for (int i = 1; i <= V; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < E; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                graph[u].add(v);
                graph[v].add(u);
            }

            if (isBipartite(graph, V)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    private static boolean isBipartite(List<Integer>[] graph, int V) {
        int[] colors = new int[V + 1];
        Arrays.fill(colors, -1);

        for (int i = 1; i <= V; i++) {
            if (colors[i] == -1) {
                if (!bfsCheck(graph, i, colors)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean bfsCheck(List<Integer>[] graph, int start, int[] colors) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        colors[start] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : graph[node]) {
                if (colors[neighbor] == -1) {
                    colors[neighbor] = 1 - colors[node];
                    queue.add(neighbor);
                } else if (colors[neighbor] == colors[node]) {
                    return false;
                }
            }
        }
        return true;
    }
}
