import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static class Point implements Comparable<Point> {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point other) {
            if (this.y == other.y) {
                return Integer.compare(this.x, other.x);
            }
            return Integer.compare(this.y, other.y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Point[] points = new Point[N];

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points[i] = new Point(x, y);
        }

        Arrays.sort(points);

        for (Point p : points) {
            System.out.println(p.x + " " + p.y);
        }
    }
}