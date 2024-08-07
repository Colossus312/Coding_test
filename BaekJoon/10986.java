import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> modCount = new HashMap<>();
        modCount.put(0, 1);

        long count = 0;
        long prefixSum = 0;

        for (int i = 0; i < N; i++) {
            prefixSum += A[i];
            int mod = (int) (prefixSum % M);
            if (mod < 0) {
                mod += M;
            }

            if (modCount.containsKey(mod)) {
                count += modCount.get(mod);
                modCount.put(mod, modCount.get(mod) + 1);
            } else {
                modCount.put(mod, 1);
            }
        }

        System.out.println(count);
    }
}
