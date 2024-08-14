import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] roadLengths = new long[N - 1];
        long[] gasPrices = new long[N];

        for (int i = 0; i < N - 1; i++) {
            roadLengths[i] = sc.nextLong();
        }
        for (int i = 0; i < N; i++) {
            gasPrices[i] = sc.nextLong();
        }

        long minCost = 0;
        long minPrice = gasPrices[0];

        for (int i = 0; i < N - 1; i++) {
            if (gasPrices[i] < minPrice) {
                minPrice = gasPrices[i];
            }
            minCost += minPrice * roadLengths[i];
        }

        System.out.println(minCost);
    }
}
