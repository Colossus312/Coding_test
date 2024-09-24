import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static List<int[]> islands;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Bridge implements Comparable<Bridge> {
        int island1, island2, length;

        Bridge(int island1, int island2, int length) {
            this.island1 = island1;
            this.island2 = island2;
            this.length = length;
        }

        public int compareTo(Bridge o) {
            return Integer.compare(this.length, o.length);
        }
    }

    static int[] parent;

    static int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            parent[rootY] = rootX;
        }
    }

    static void bfs(int x, int y, int islandId) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        map[x][y] = islandId;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && !visited[nx][ny] && map[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    map[nx][ny] = islandId;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }

    static List<Bridge> buildBridges() {
        List<Bridge> bridges = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] > 0) {
                    int islandId = map[i][j];

                    for (int d = 0; d < 4; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];
                        int length = 0;

                        while (nx >= 0 && ny >= 0 && nx < N && ny < M && map[nx][ny] == 0) {
                            length++;
                            nx += dx[d];
                            ny += dy[d];
                        }

                        if (nx >= 0 && ny >= 0 && nx < N && ny < M && map[nx][ny] > 0 && map[nx][ny] != islandId && length >= 2) {
                            bridges.add(new Bridge(islandId, map[nx][ny], length));
                        }
                    }
                }
            }
        }

        return bridges;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int islandId = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    bfs(i, j, islandId++);
                }
            }
        }

        List<Bridge> bridges = buildBridges();
        Collections.sort(bridges);

        parent = new int[islandId];
        for (int i = 1; i < islandId; i++) {
            parent[i] = i;
        }

        int totalLength = 0;
        int count = 0;

        for (Bridge bridge : bridges) {
            if (find(bridge.island1) != find(bridge.island2)) {
                union(bridge.island1, bridge.island2);
                totalLength += bridge.length;
                count++;
            }
        }

        int root = find(1);
        boolean allConnected = true;
        for (int i = 2; i < islandId; i++) {
            if (find(i) != root) {
                allConnected = false;
                break;
            }
        }

        if (allConnected) {
            System.out.println(totalLength);
        } else {
            System.out.println(-1);
        }
    }
}
