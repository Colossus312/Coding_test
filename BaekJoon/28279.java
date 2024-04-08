import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    private static final Deque<Integer> deque = new ArrayDeque<>();
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int commandsCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < commandsCount; i++) {
            processCommand(br.readLine());
        }

        System.out.println(sb);
    }

    private static void processCommand(String commandLine) {
        String[] parts = commandLine.split(" ");
        int command = Integer.parseInt(parts[0]);

        switch (command) {
            case 1:
                deque.addFirst(getCommandValue(parts));
                break;
            case 2:
                deque.addLast(getCommandValue(parts));
                break;
            case 3:
                sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append('\n');
                break;
            case 4:
                sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append('\n');
                break;
            case 5:
                sb.append(deque.size()).append('\n');
                break;
            case 6:
                sb.append(deque.isEmpty() ? 1 : 0).append('\n');
                break;
            case 7:
                sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append('\n');
                break;
            case 8:
                sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append('\n');
                break;
            default:
                break;
        }
    }

    private static int getCommandValue(String[] commandParts) {
        return Integer.parseInt(commandParts[1]);
    }
}