import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            frequencyMap.put(A[i], frequencyMap.getOrDefault(A[i], 0) + 1);
        }

        int[] result = new int[N];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = N - 1; i >= 0; i--) {
            int currentFreq = frequencyMap.get(A[i]);

            while (!stack.isEmpty() && frequencyMap.get(stack.peek()) <= currentFreq) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }

            stack.push(A[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
