import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        scanner.close();

        int factorial = 1;
        for (int i = 2; i <= N; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}