class Solution {
    public int[][] solution(int n) {
        int[][] result = new int[n][n];

        int value = 1;
        int minCol = 0;
        int maxCol = n - 1;
        int minRow = 0;
        int maxRow = n - 1;

        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                result[minRow][i] = value++;
            }
            for (int i = minRow + 1; i <= maxRow; i++) {
                result[i][maxCol] = value++;
            }
            if (minRow != maxRow) {
                for (int i = maxCol - 1; i >= minCol; i--) {
                    result[maxRow][i] = value++;
                }
            }
            if (minCol != maxCol) {
                for (int i = maxRow - 1; i > minRow; i--) {
                    result[i][minCol] = value++;
                }
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }
        return result;
    }
}