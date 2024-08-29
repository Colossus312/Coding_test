import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;
        int closestSum = Integer.MAX_VALUE;
        int solution1 = 0, solution2 = 0;

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (Math.abs(currentSum) < Math.abs(closestSum)) {
                closestSum = currentSum;
                solution1 = arr[left];
                solution2 = arr[right];
            }

            if (currentSum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(solution1 + " " + solution2);
    }
}
