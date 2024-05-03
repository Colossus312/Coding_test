import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();

        long[] cables = new long[K];
        long maxCableLength = 0;

        for (int i = 0; i < K; i++) {
            cables[i] = scanner.nextLong();
            if (cables[i] > maxCableLength) {
                maxCableLength = cables[i];
            }
        }

        long low = 1, high = maxCableLength;
        long bestLength = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            if (canMakeCables(cables, mid, N)) {
                bestLength = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(bestLength);
    }

    private static boolean canMakeCables(long[] cables, long length, int needed) {
        long count = 0;
        for (long cable : cables) {
            count += cable / length;
            if (count >= needed) {
                return true;
            }
        }
        return false;
    }
}