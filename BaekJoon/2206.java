import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static class Node {
        int x, y, distance, wallBroken;

        Node(int x, int y, int distance, int wallBroken) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.wallBroken = wallBroken;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = scanner.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        int[][][] visited = new int[N][M][2];
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0, 1, 0));
        visited[0][0][0] = 1;

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node.x == N - 1 && node.y == M - 1) {
                System.out.println(node.distance);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (map[nx][ny] == 0 && visited[nx][ny][node.wallBroken] == 0) {
                        visited[nx][ny][node.wallBroken] = 1;
                        queue.offer(new Node(nx, ny, node.distance + 1, node.wallBroken));
                    }

                    if (map[nx][ny] == 1 && node.wallBroken == 0 && visited[nx][ny][1] == 0) {
                        visited[nx][ny][1] = 1;
                        queue.offer(new Node(nx, ny, node.distance + 1, 1));
                    }
                }
            }
        }

        System.out.println(-1);
    }
}
