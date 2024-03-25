import java.io.*;
import java.util.*;

public class Main {
    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(trees);

        int gcdValue = trees[1] - trees[0];
        for (int i = 2; i < N; i++) {
            gcdValue = gcd(gcdValue, trees[i] - trees[i-1]);
        }

        int treesToPlant = 0;
        for (int i = 1; i < N; i++) {
            treesToPlant += (trees[i] - trees[i-1]) / gcdValue - 1;
        }

        System.out.println(treesToPlant);
    }
}