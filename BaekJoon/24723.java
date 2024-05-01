import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int numberOfPaths = 1;

        for (int level = 1; level <= N; level++) {
            numberOfPaths *= 2;
        }

        System.out.println(numberOfPaths);
    }
}
