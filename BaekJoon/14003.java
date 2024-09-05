import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N];
        int[] indexTracker = new int[N];
        int[] lis = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        int lisLength = 0;

        for (int i = 0; i < N; i++) {
            int pos = Arrays.binarySearch(dp, 0, lisLength, A[i]);
            if (pos < 0) pos = -(pos + 1);
            dp[pos] = A[i];
            indexTracker[i] = pos;
            if (pos == lisLength) lisLength++;
        }

        int lisIndex = lisLength - 1;
        for (int i = N - 1; i >= 0; i--) {
            if (indexTracker[i] == lisIndex) {
                lis[lisIndex] = A[i];
                lisIndex--;
            }
        }

        System.out.println(lisLength);
        for (int i = 0; i < lisLength; i++) {
            System.out.print(lis[i] + " ");
        }
    }
}
