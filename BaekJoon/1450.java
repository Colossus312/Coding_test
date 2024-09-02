import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long C = scanner.nextLong();
        int[] weights = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
        }

        int mid = N / 2;

        List<Long> firstHalf = generateSums(weights, 0, mid);

        List<Long> secondHalf = generateSums(weights, mid, N);

        Collections.sort(secondHalf);

        long count = 0;

        for (long sum : firstHalf) {
            count += countValidSums(secondHalf, C - sum);
        }

        System.out.println(count);
    }

    private static List<Long> generateSums(int[] weights, int start, int end) {
        List<Long> sums = new ArrayList<>();
        int n = end - start;

        for (int i = 0; i < (1 << n); i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += weights[start + j];
                }
            }
            sums.add(sum);
        }

        return sums;
    }

    private static long countValidSums(List<Long> sums, long target) {
        int left = 0;
        int right = sums.size();

        while (left < right) {
            int mid = (left + right) / 2;
            if (sums.get(mid) <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
