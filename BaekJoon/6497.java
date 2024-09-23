import java.io.*;
import java.util.*;

public class Main {
    static class Edge implements Comparable<Edge> {
        int u, v;
        int w;

        Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }

        public int compareTo(Edge o) {
            return this.w - o.w;
        }
    }

    static int[] parent;

    static int find(int u) {
        if (parent[u] != u)
            parent[u] = find(parent[u]);
        return parent[u];
    }

    static void union(int u, int v) {
        parent[find(u)] = find(v);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] mn = br.readLine().split(" ");
            int m = Integer.parseInt(mn[0]);
            int n = Integer.parseInt(mn[1]);
            if (m == 0 && n == 0)
                break;
            Edge[] edges = new Edge[n];
            long totalCost = 0;
            for (int i = 0; i < n; i++) {
                String[] xyz = br.readLine().split(" ");
                int x = Integer.parseInt(xyz[0]);
                int y = Integer.parseInt(xyz[1]);
                int z = Integer.parseInt(xyz[2]);
                edges[i] = new Edge(x, y, z);
                totalCost += z;
            }
            Arrays.sort(edges);
            parent = new int[m];
            for (int i = 0; i < m; i++)
                parent[i] = i;
            long mstCost = 0;
            for (Edge e : edges) {
                int u = e.u;
                int v = e.v;
                if (find(u) != find(v)) {
                    union(u, v);
                    mstCost += e.w;
                }
            }
            System.out.println(totalCost - mstCost);
        }
    }
}
