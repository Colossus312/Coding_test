import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "1":
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case "2":
                    if (stack.isEmpty()) {
                        output.append("-1\n");
                    } else {
                        output.append(stack.pop()).append("\n");
                    }
                    break;
                case "3":
                    output.append(stack.size()).append("\n");
                    break;
                case "4":
                    output.append(stack.isEmpty() ? "1\n" : "0\n");
                    break;
                case "5":
                    if (stack.isEmpty()) {
                        output.append("-1\n");
                    } else {
                        output.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }

        System.out.print(output.toString());
    }
}