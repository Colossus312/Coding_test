import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Integer> stack;

    public Main() {
        this.stack = new ArrayList<>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.remove(stack.size() - 1);
        }
    }

    public int size() {
        return stack.size();
    }

    public int empty() {
        return stack.isEmpty() ? 1 : 0;
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.get(stack.size() - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Main stack = new Main();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            switch (command) {
                case "push":
                    stack.push(Integer.parseInt(parts[1]));
                    break;
                case "pop":
                    output.append(stack.pop()).append("\n");
                    break;
                case "size":
                    output.append(stack.size()).append("\n");
                    break;
                case "empty":
                    output.append(stack.empty()).append("\n");
                    break;
                case "top":
                    output.append(stack.top()).append("\n");
                    break;
            }
        }

        System.out.print(output.toString());
    }
}