import java.util.Scanner;

public class Main {

    static int code1Count = 0;
    static int code2Count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        fib(n);
        fibonacci(n);

        System.out.println(code1Count + " " + code2Count);
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            code1Count++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fibonacci(int n) {
        int[] f = new int[n + 1];
        f[1] = f[2] = 1;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            code2Count++;
        }
        return f[n];
    }
}