import java.util.*;

public class Main {

    private static class Edge {
        int node, weight;

        public Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    private static class Node implements Comparable<Node> {
        int vertex, distance;

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    private static void dijkstra(int start, int[] dist, List<Edge>[] graph) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int u = current.vertex;
            int currentDist = current.distance;

            if (currentDist > dist[u]) {
                continue;
            }

            for (Edge edge : graph[u]) {
                int v = edge.node;
                int weight = edge.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new Node(v, dist[v]));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int numCandidates = scanner.nextInt();
            int s = scanner.nextInt();
            int g = scanner.nextInt();
            int h = scanner.nextInt();

            List<Edge>[] graph = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }

            int ghWeight = 0;
            for (int i = 0; i < m; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int d = scanner.nextInt();
                graph[a].add(new Edge(b, d));
                graph[b].add(new Edge(a, d));
                if ((a == g && b == h) || (a == h && b == g)) {
                    ghWeight = d;
                }
            }

            int[] destCandidates = new int[numCandidates];
            for (int i = 0; i < numCandidates; i++) {
                destCandidates[i] = scanner.nextInt();
            }

            int[] distFromS = new int[n + 1];
            int[] distFromG = new int[n + 1];
            int[] distFromH = new int[n + 1];
            Arrays.fill(distFromS, Integer.MAX_VALUE);
            Arrays.fill(distFromG, Integer.MAX_VALUE);
            Arrays.fill(distFromH, Integer.MAX_VALUE);

            dijkstra(s, distFromS, graph);
            dijkstra(g, distFromG, graph);
            dijkstra(h, distFromH, graph);

            List<Integer> validDestinations = new ArrayList<>();
            for (int x : destCandidates) {
                if (distFromS[x] == distFromS[g] + ghWeight + distFromH[x] ||
                        distFromS[x] == distFromS[h] + ghWeight + distFromG[x]) {
                    validDestinations.add(x);
                }
            }

            Collections.sort(validDestinations);
            for (int dest : validDestinations) {
                System.out.print(dest + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
