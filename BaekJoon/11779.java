import java.util.*;

public class Main {
    static class Node implements Comparable<Node> {
        int city, cost;

        Node(int city, int cost) {
            this.city = city;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    static int n, m;
    static List<Node>[] graph;
    static int[] dist;
    static int[] prev;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList[n + 1];
        dist = new int[n + 1];
        prev = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int cost = sc.nextInt();
            graph[u].add(new Node(v, cost));
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        dijkstra(start);

        System.out.println(dist[end]);
        List<Integer> path = new ArrayList<>();
        for (int at = end; at != 0; at = prev[at]) {
            path.add(at);
        }
        Collections.reverse(path);

        System.out.println(path.size());
        for (int city : path) {
            System.out.print(city + " ");
        }
    }

    static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int city = current.city;
            int cost = current.cost;

            if (cost > dist[city]) continue;

            for (Node next : graph[city]) {
                int nextCity = next.city;
                int nextCost = cost + next.cost;

                if (nextCost < dist[nextCity]) {
                    dist[nextCity] = nextCost;
                    prev[nextCity] = city;
                    pq.add(new Node(nextCity, nextCost));
                }
            }
        }
    }
}
