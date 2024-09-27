import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            if (command.startsWith("push")) {
                queue.offer(Integer.parseInt(command.split(" ")[1]));
            } else if (command.equals("pop")) {
                sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
            } else if (command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(queue.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("front")) {
                sb.append(queue.isEmpty() ? -1 : queue.peekFirst()).append("\n");
            } else if (command.equals("back")) {
                sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n");
            }
        }
        System.out.print(sb);
    }
}