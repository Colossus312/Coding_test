import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        StringBuilder result = new StringBuilder();

        int longCount = N / 4;

        for (int i = 0; i < longCount - 1; i++) {
            result.append("long ");
        }
        result.append("long int");

        System.out.println(result.toString());
    }
}