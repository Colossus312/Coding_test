import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long k = Long.parseLong(br.readLine());

        long low = 1;
        long high = (long) N * N;
        while (low < high) {
            long mid = (low + high) / 2;
            if (countLessOrEqual(mid, N) < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        System.out.println(low);
    }

    private static long countLessOrEqual(long x, int N) {
        long count = 0;
        for (int i = 1; i <= N; i++) {
            count += Math.min(x / i, N);
        }
        return count;
    }
}