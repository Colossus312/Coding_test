import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] types = new int[N];
        for (int i = 0; i < N; i++) {
            types[i] = Integer.parseInt(st.nextToken());
        }

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (types[i] == 0) {
                deque.addLast(value);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (st.hasMoreTokens()) {
                int value = Integer.parseInt(st.nextToken());
                deque.addFirst(value);
                if (!deque.isEmpty()) {
                    sb.append(deque.pollLast()).append(" ");
                }
            }
        }

        System.out.println(sb.toString().trim());
        br.close();
    }
}