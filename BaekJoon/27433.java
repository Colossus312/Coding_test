import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long result = factorial(N);

        if (result == 1 && N == 0) {
            System.out.println("1");
        } else {
            System.out.println(result);
        }

        scanner.close();
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}