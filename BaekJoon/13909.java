import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int openWindows = (int)Math.sqrt(N);

        System.out.println(openWindows);

        scanner.close();
    }
}