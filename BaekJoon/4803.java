import java.util.*;

public class Main {
    static int n, m;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            n = sc.nextInt();
            m = sc.nextInt();

            if (n == 0 && m == 0) break;

            graph = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph[u].add(v);
                graph[v].add(u);
            }

            visited = new boolean[n + 1];
            int treeCount = 0;

            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    if (isTree(i, -1)) {
                        treeCount++;
                    }
                }
            }

            if (treeCount == 0) {
                System.out.println("Case " + caseNumber + ": No trees.");
            } else if (treeCount == 1) {
                System.out.println("Case " + caseNumber + ": There is one tree.");
            } else {
                System.out.println("Case " + caseNumber + ": A forest of " + treeCount + " trees.");
            }

            caseNumber++;
        }

        sc.close();
    }

    static boolean isTree(int node, int parent) {
        visited[node] = true;

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                if (!isTree(neighbor, node)) return false;
            } else if (neighbor != parent) {
                return false;
            }
        }

        return true;
    }
}
