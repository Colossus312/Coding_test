import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int absA = Math.abs(a);
                int absB = Math.abs(b);
                if (absA == absB) {
                    return Integer.compare(a, b);
                }
                return Integer.compare(absA, absB);
            }
        });

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.add(x);
            }
        }
        scanner.close();
    }
}