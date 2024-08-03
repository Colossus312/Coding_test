import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static List<Integer> complexSizes = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    int size = dfs(i, j);
                    complexSizes.add(size);
                }
            }
        }

        Collections.sort(complexSizes);
        System.out.println(complexSizes.size());
        for (int size : complexSizes) {
            System.out.println(size);
        }
    }

    static int dfs(int x, int y) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{x, y});
        visited[x][y] = true;
        int count = 0;

        while (!stack.isEmpty()) {
            int[] pos = stack.pop();
            int cx = pos[0];
            int cy = pos[1];
            count++;

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n && map[nx][ny] == 1 && !visited[nx][ny]) {
                    stack.push(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }

        return count;
    }
}
