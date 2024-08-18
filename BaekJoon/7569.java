import java.io.*;
import java.util.*;

public class Main {
    static int M, N, H;
    static int[][][] farm;
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        farm = new int[H][N][M];
        Queue<int[]> queue = new LinkedList<>();

        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());
                for (int m = 0; m < M; m++) {
                    farm[h][n][m] = Integer.parseInt(st.nextToken());
                    if (farm[h][n][m] == 1) {
                        queue.add(new int[]{h, n, m});
                    }
                }
            }
        }

        int days = bfs(queue);

        if (!isAllRipe()) {
            System.out.println("-1");
        } else {
            System.out.println(days);
        }
    }

    static int bfs(Queue<int[]> queue) {
        int days = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            days++;
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int z = curr[0], y = curr[1], x = curr[2];

                for (int d = 0; d < 6; d++) {
                    int nz = z + dz[d];
                    int ny = y + dy[d];
                    int nx = x + dx[d];

                    if (nz >= 0 && nz < H && ny >= 0 && ny < N && nx >= 0 && nx < M) {
                        if (farm[nz][ny][nx] == 0) {
                            farm[nz][ny][nx] = 1;
                            queue.add(new int[]{nz, ny, nx});
                        }
                    }
                }
            }
        }

        return days;
    }

    static boolean isAllRipe() {
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (farm[h][n][m] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
