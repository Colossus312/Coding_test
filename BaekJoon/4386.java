import java.util.*;
public class Main {
    static int[] parent;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];
        for(int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }
        ArrayList<Edge> edges = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                double dist = Math.hypot(x[i]-x[j], y[i]-y[j]);
                edges.add(new Edge(i, j, dist));
            }
        }
        Collections.sort(edges);
        parent = new int[n];
        for(int i = 0; i < n; i++) parent[i] = i;
        double total = 0.0;
        for(Edge e : edges) {
            if(union(e.u, e.v)) total += e.cost;
        }
        System.out.printf("%.2f\n", total);
    }
    static int find(int x) {
        if(parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }
    static boolean union(int x, int y) {
        int px = find(x), py = find(y);
        if(px == py) return false;
        parent[py] = px;
        return true;
    }
}
class Edge implements Comparable<Edge> {
    int u, v;
    double cost;
    Edge(int u, int v, double cost) {
        this.u = u;
        this.v = v;
        this.cost = cost;
    }
    public int compareTo(Edge other) {
        return Double.compare(this.cost, other.cost);
    }
}
