import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        List<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        boolean[] visited = new boolean[N + 1];
        StringBuilder sb = new StringBuilder();
        dfs(V, graph, visited, sb);
        System.out.println(sb.toString().trim());

        visited = new boolean[N + 1];
        sb = new StringBuilder();
        bfs(V, graph, visited, sb);
        System.out.println(sb.toString().trim());
    }

    private static void dfs(int v, List<Integer>[] graph, boolean[] visited, StringBuilder sb) {
        visited[v] = true;
        sb.append(v).append(' ');
        for (int next : graph[v]) {
            if (!visited[next]) {
                dfs(next, graph, visited, sb);
            }
        }
    }

    private static void bfs(int start, List<Integer>[] graph, boolean[] visited, StringBuilder sb) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int v = queue.poll();
            sb.append(v).append(' ');
            for (int next : graph[v]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}
