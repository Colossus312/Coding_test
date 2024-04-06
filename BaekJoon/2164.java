import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        while (deque.size() > 1) {
            deque.removeFirst();
            deque.addLast(deque.removeFirst());
        }

        System.out.println(deque.getFirst());
        sc.close();
    }
}