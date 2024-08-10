import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair {
    int x, y, dist;

    Pair(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] maze = new int[N][M];

        for (int i = 0; i < N; i++) {
            String row = sc.next();
            for (int j = 0; j < M; j++) {
                maze[i][j] = row.charAt(j) - '0';
            }
        }

        int result = bfs(maze, N, M);
        System.out.println(result);
    }

    private static int bfs(int[][] maze, int N, int M) {
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        boolean[][] visited = new boolean[N][M];
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, 0, 1));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (p.x == N - 1 && p.y == M - 1) {
                return p.dist;
            }

            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny] && maze[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.add(new Pair(nx, ny, p.dist + 1));
                }
            }
        }

        return -1;
    }
}
