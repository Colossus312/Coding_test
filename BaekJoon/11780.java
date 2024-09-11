import java.util.*;
import java.io.*;

public class Main {
    static final int INF = 100000000;
    static int n, m;
    static int[][] dist, next;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        dist = new int[n + 1][n + 1];
        next = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            Arrays.fill(next[i], -1);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (dist[a][b] > c) {
                dist[a][b] = c;
                next[a][b] = b;
            }
        }

        floydWarshall();

        printMinCosts();
        printPaths();
    }

    static void floydWarshall() {
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        next[i][j] = next[i][k];
                    }
                }
            }
        }
    }

    static void printMinCosts() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (dist[i][j] == INF) sb.append(0).append(' ');
                else sb.append(dist[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }

    static void printPaths() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (dist[i][j] == INF) {
                    sb.append(0).append('\n');
                } else {
                    List<Integer> path = reconstructPath(i, j);
                    sb.append(path.size()).append(' ');
                    for (int city : path) {
                        sb.append(city).append(' ');
                    }
                    sb.append('\n');
                }
            }
        }
        System.out.print(sb.toString());
    }

    static List<Integer> reconstructPath(int i, int j) {
        List<Integer> path = new ArrayList<>();
        if (next[i][j] == -1) return path;
        path.add(i);
        while (i != j) {
            i = next[i][j];
            path.add(i);
        }
        return path;
    }
}
