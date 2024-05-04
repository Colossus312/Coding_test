import java.util.*;
import java.io.*;

public class Main {
    static long N, M;
    static long[] trees;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Long.parseLong(st.nextToken());
        M = Long.parseLong(st.nextToken());
        trees = new long[(int) N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(trees);

        long low = 0;
        long high = trees[(int) N - 1];
        long maxH = 0;

        while (low <= high) {
            long mid = (low + high) / 2;

            if (canTakeEnoughWood(mid)) {
                maxH = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(maxH);
    }

    private static boolean canTakeEnoughWood(long cutHeight) {
        long total = 0;
        for (long tree : trees) {
            if (tree > cutHeight) {
                total += tree - cutHeight;
                if (total >= M) {
                    return true;
                }
            }
        }
        return false;
    }
}