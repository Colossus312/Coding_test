import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final long INF = Long.MAX_VALUE;
    static int N, M;
    static long[] dist;
    static int[][] buses;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        dist = new long[N + 1];
        buses = new int[M][3];

        Arrays.fill(dist, INF);
        dist[1] = 0;

        for (int i = 0; i < M; i++) {
            buses[i][0] = sc.nextInt();
            buses[i][1] = sc.nextInt();
            buses[i][2] = sc.nextInt();
        }

        boolean updated = false;
        for (int i = 0; i < N; i++) {
            updated = false;
            for (int j = 0; j < M; j++) {
                int from = buses[j][0];
                int to = buses[j][1];
                int time = buses[j][2];
                if (dist[from] != INF && dist[to] > dist[from] + time) {
                    dist[to] = dist[from] + time;
                    updated = true;
                }
            }
            if (!updated) break;
        }

        if (updated) {
            for (int j = 0; j < M; j++) {
                int from = buses[j][0];
                int to = buses[j][1];
                int time = buses[j][2];
                if (dist[from] != INF && dist[to] > dist[from] + time) {
                    System.out.println("-1");
                    return;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if (dist[i] == INF) {
                System.out.println("-1");
            } else {
                System.out.println(dist[i]);
            }
        }
    }
}
