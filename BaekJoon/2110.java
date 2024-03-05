import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static boolean canPlace(int[] houses, int distance, int c) {
        int count = 1;
        int lastInstalled = houses[0];

        for (int i = 1; i < houses.length; i++) {
            if (houses[i] - lastInstalled >= distance) {
                count++;
                lastInstalled = houses[i];
                if (count == c) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int findMaxMinDistance(int[] houses, int c) {
        Arrays.sort(houses);
        int low = 1;
        int high = houses[houses.length - 1] - houses[0];
        int best = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canPlace(houses, mid, c)) {
                best = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return best;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] houses = new int[n];

        for (int i = 0; i < n; i++) {
            houses[i] = scanner.nextInt();
        }

        int result = findMaxMinDistance(houses, c);
        System.out.println(result);

        scanner.close();
    }
}