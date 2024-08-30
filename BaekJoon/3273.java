import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        scanner.close();

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int pairCount = 0;

        for (int i = 0; i < n; i++) {
            int complement = x - arr[i];
            if (frequencyMap.containsKey(complement)) {
                pairCount += frequencyMap.get(complement);
            }
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(pairCount);
    }
}
