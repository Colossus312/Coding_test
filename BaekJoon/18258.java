import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            switch (command) {
                case "push":
                    int value = Integer.parseInt(parts[1]);
                    queue.offer(value);
                    break;
                case "pop":
                    Integer frontValue = queue.poll();
                    System.out.println(frontValue != null ? frontValue : -1);
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    Integer peekValue = queue.peek();
                    System.out.println(peekValue != null ? peekValue : -1);
                    break;
                case "back":
                    Integer backValue = queue.peekLast();
                    System.out.println(backValue != null ? backValue : -1);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
        scanner.close();
    }
}