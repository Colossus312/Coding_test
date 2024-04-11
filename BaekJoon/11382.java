import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split(" ");

        long A = Long.parseLong(inputs[0]);
        long B = Long.parseLong(inputs[1]);
        long C = Long.parseLong(inputs[2]);

        long sum = A + B + C;

        System.out.println(sum);

        scanner.close();
    }
}

