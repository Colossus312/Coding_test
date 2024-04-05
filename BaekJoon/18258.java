import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.startsWith("push")) {
                int value = Integer.parseInt(input.split(" ")[1]);
                queue.offer(value);
            } else if ("pop".equals(input)) {
                out.println(queue.isEmpty() ? -1 : queue.poll());
            } else if ("size".equals(input)) {
                out.println(queue.size());
            } else if ("empty".equals(input)) {
                out.println(queue.isEmpty() ? 1 : 0);
            } else if ("front".equals(input)) {
                out.println(queue.isEmpty() ? -1 : queue.peek());
            } else if ("back".equals(input)) {
                out.println(queue.isEmpty() ? -1 : queue.peekLast());
            }
        }
        br.close();
        out.flush();
        out.close();
    }
}