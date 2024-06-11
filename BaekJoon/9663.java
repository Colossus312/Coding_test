import java.util.Scanner;

public class Main {
    private int count = 0;

    public int totalNQueens(int n) {
        if (n <= 0) return 0;
        int[] positions = new int[n];
        solveNQueens(positions, 0, n);
        return count;
    }

    private void solveNQueens(int[] positions, int row, int n) {
        if (row == n) {
            count++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(positions, row, col)) {
                positions[row] = col;
                solveNQueens(positions, row + 1, n);
            }
        }
    }

    private boolean isSafe(int[] positions, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (positions[i] == col || Math.abs(positions[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Main solution = new Main();
        System.out.println(solution.totalNQueens(N));
        scanner.close();
    }
}