import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        System.out.println(minWiresToRemove(a, b));
    }

    private static int minWiresToRemove(int[] a, int[] b) {
        int n = a.length;

        int[][] wires = new int[n][2];
        for (int i = 0; i < n; i++) {
            wires[i][0] = a[i];
            wires[i][1] = b[i];
        }
        Arrays.sort(wires, (x, y) -> x[0] - y[0]);

        int[] lis = new int[n];
        int length = 0;

        for (int i = 0; i < n; i++) {
            int pos = Arrays.binarySearch(lis, 0, length, wires[i][1]);
            if (pos < 0) pos = -(pos + 1);
            lis[pos] = wires[i][1];
            if (pos == length) length++;
        }

        return n - length;
    }
}