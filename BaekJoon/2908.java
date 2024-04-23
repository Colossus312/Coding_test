import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int reversedA = reverseNumber(A);
        int reversedB = reverseNumber(B);

        if (reversedA > reversedB) {
            System.out.println(reversedA);
        } else {
            System.out.println(reversedB);
        }

        scanner.close();
    }

    public static int reverseNumber(int number) {
        StringBuilder sb = new StringBuilder(Integer.toString(number));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}