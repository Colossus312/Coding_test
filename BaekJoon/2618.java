import java.io.*;
import java.util.*;

public class Main {
    static int N, W;
    static int[][] events;
    static int[][] dp;
    static int[][][] parent;

    static int distance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    static int distanceFrom(int car, int event) {
        int x1, y1, x2 = events[event][0], y2 = events[event][1];
        if (car == 0) {
            x1 = y1 = 1;
        } else if (car == -1) {
            x1 = y1 = N;
        } else {
            x1 = events[car][0];
            y1 = events[car][1];
        }
        return distance(x1, y1, x2, y2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        W = Integer.parseInt(br.readLine());

        events = new int[W + 1][2];
        for (int i = 1; i <= W; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            events[i][0] = Integer.parseInt(st.nextToken());
            events[i][1] = Integer.parseInt(st.nextToken());
        }

        dp = new int[W + 2][W + 2];
        parent = new int[W + 2][W + 2][2];
        for (int i = 0; i <= W + 1; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][0] = 0;

        for (int car1 = 0; car1 <= W; car1++) {
            for (int car2 = 0; car2 <= W; car2++) {
                if (dp[car1][car2] == Integer.MAX_VALUE) continue;
                int nextEvent = Math.max(car1, car2) + 1;
                if (nextEvent > W) continue;

                int cost1 = dp[car1][car2] + distanceFrom(car1 == 0 ? 0 : car1, nextEvent);
                if (dp[nextEvent][car2] > cost1) {
                    dp[nextEvent][car2] = cost1;
                    parent[nextEvent][car2][0] = car1;
                    parent[nextEvent][car2][1] = car2;
                }

                int cost2 = dp[car1][car2] + distanceFrom(car2 == 0 ? -1 : car2, nextEvent);
                if (dp[car1][nextEvent] > cost2) {
                    dp[car1][nextEvent] = cost2;
                    parent[car1][nextEvent][0] = car1;
                    parent[car1][nextEvent][1] = car2;
                }
            }
        }

        int minDistance = Integer.MAX_VALUE;
        int endCar1 = 0, endCar2 = 0;
        for (int i = 0; i <= W; i++) {
            if (dp[W][i] < minDistance) {
                minDistance = dp[W][i];
                endCar1 = W;
                endCar2 = i;
            }
            if (dp[i][W] < minDistance) {
                minDistance = dp[i][W];
                endCar1 = i;
                endCar2 = W;
            }
        }

        System.out.println(minDistance);

        int[] assignedCar = new int[W + 1];
        int car1 = endCar1;
        int car2 = endCar2;
        while (car1 != 0 || car2 != 0) {
            int prevCar1 = parent[car1][car2][0];
            int prevCar2 = parent[car1][car2][1];
            int event = Math.max(car1, car2);
            if (car1 != prevCar1) {
                assignedCar[event] = 1;
            } else {
                assignedCar[event] = 2;
            }
            car1 = prevCar1;
            car2 = prevCar2;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= W; i++) {
            sb.append(assignedCar[i]).append('\n');
        }
        System.out.print(sb);
    }
}
