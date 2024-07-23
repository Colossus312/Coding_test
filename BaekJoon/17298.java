import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[] NGE = new int[N];
        Stack<Integer> stack = new Stack<>();

        for (int i = N - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] <= A[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                NGE[i] = -1;
            } else {
                NGE[i] = A[stack.peek()];
            }
            stack.push(i);
        }

        for (int i = 0; i < N; i++) {
            pw.print(NGE[i]);
            if (i < N - 1) pw.print(" ");
        }
        pw.flush();
    }
}
