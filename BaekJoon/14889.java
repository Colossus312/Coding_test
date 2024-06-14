import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[][] S;
    static int minDifference = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        S = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean[] team = new boolean[N];
        divideTeams(0, 0, team);

        System.out.println(minDifference);
    }

    public static void divideTeams(int idx, int count, boolean[] team) {
        if (count == N / 2) {
            calculateDifference(team);
            return;
        }
        if (idx >= N) return;

        team[idx] = true;
        divideTeams(idx + 1, count + 1, team);
        team[idx] = false;
        divideTeams(idx + 1, count, team);
    }

    public static void calculateDifference(boolean[] team) {
        int startAbility = 0, linkAbility = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (team[i] && team[j]) {
                    startAbility += S[i][j] + S[j][i];
                } else if (!team[i] && !team[j]) {
                    linkAbility += S[i][j] + S[j][i];
                }
            }
        }

        int difference = Math.abs(startAbility - linkAbility);
        minDifference = Math.min(minDifference, difference);
    }
}