import java.util.Scanner;

public class Main {

    static int N;
    static int[] numbers;
    static int[] operators = new int[4];
    static int maxResult = Integer.MIN_VALUE;
    static int minResult = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            operators[i] = scanner.nextInt();
        }

        calculate(numbers[0], 1);

        System.out.println(maxResult);
        System.out.println(minResult);
    }

    static void calculate(int currentResult, int index) {
        if (index == N) {
            if (currentResult > maxResult) {
                maxResult = currentResult;
            }
            if (currentResult < minResult) {
                minResult = currentResult;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                switch (i) {
                    case 0:
                        calculate(currentResult + numbers[index], index + 1);
                        break;
                    case 1:
                        calculate(currentResult - numbers[index], index + 1);
                        break;
                    case 2:
                        calculate(currentResult * numbers[index], index + 1);
                        break;
                    case 3:
                        calculate(currentResult / numbers[index], index + 1);
                        break;
                }
                operators[i]++;
            }
        }
    }
}