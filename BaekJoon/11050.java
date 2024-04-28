import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(binomialCoefficient(N, K));
        scanner.close();
    }

    public static int binomialCoefficient(int N, int K) {
        return factorial(N) / (factorial(K) * factorial(N - K));
    }

    public static int factorial(int number) {
        int result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }
}