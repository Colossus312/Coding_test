import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    static int n;
    static ArrayList<Edge>[] adj;
    static boolean[] visited;
    static int maxDist = 0;
    static int maxNode = 0;

    public static void dfs(int node, int dist) {
        visited[node] = true;
        if (dist > maxDist) {
            maxDist = dist;
            maxNode = node;
        }
        for (Edge e : adj[node]) {
            if (!visited[e.to]) {
                dfs(e.to, dist + e.weight);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        adj = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) { // 인덱스 0부터 초기화
            adj[i] = new ArrayList<Edge>();
        }
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            adj[parent].add(new Edge(child, weight));
            adj[child].add(new Edge(parent, weight));
        }

        visited = new boolean[n + 1];
        dfs(1, 0);

        visited = new boolean[n + 1];
        maxDist = 0;
        dfs(maxNode, 0);

        System.out.println(maxDist);
    }

    static class Edge {
        int to;
        int weight;
        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
}
