import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Point[] points = new Point[N];

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points[i] = new Point(x, y);
        }

        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.x == p2.x) {
                    return Integer.compare(p1.y, p2.y);
                } else {
                    return Integer.compare(p1.x, p2.x);
                }
            }
        });

        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }
}