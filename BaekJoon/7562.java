import java.util.*;

public class Main {

    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    static class Position {
        int x, y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int bfs(int l, Position start, Position end) {
        boolean[][] visited = new boolean[l][l];
        Queue<Position> queue = new LinkedList<>();
        queue.add(start);
        visited[start.x][start.y] = true;
        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Position curr = queue.poll();

                if (curr.x == end.x && curr.y == end.y) {
                    return moves;
                }

                for (int j = 0; j < 8; j++) {
                    int nx = curr.x + dx[j];
                    int ny = curr.y + dy[j];

                    if (nx >= 0 && ny >= 0 && nx < l && ny < l && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new Position(nx, ny));
                    }
                }
            }
            moves++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int l = scanner.nextInt();
            int startX = scanner.nextInt();
            int startY = scanner.nextInt();
            int endX = scanner.nextInt();
            int endY = scanner.nextInt();

            Position start = new Position(startX, startY);
            Position end = new Position(endX, endY);

            System.out.println(bfs(l, start, end));
        }

        scanner.close();
    }
}
