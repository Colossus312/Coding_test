import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] meetings = new int[n][2];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = scanner.nextInt();
            meetings[i][1] = scanner.nextInt();
        }

        Arrays.sort(meetings, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int count = 0;
        int lastEndTime = 0;

        for (int i = 0; i < n; i++) {
            if (meetings[i][0] >= lastEndTime) {
                lastEndTime = meetings[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
