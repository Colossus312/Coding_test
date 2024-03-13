import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] coords = new int[N][2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            coords[i][0] = Integer.parseInt(st.nextToken());
            coords[i][1] = i;
        }

        Arrays.sort(coords, Comparator.comparingInt(a -> a[0]));

        int[] result = new int[N];
        int rank = 0;
        result[coords[0][1]] = 0;
        for (int i = 1; i < N; i++) {
            if (coords[i][0] > coords[i - 1][0]) rank++;
            result[coords[i][1]] = rank;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}