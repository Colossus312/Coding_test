import java.util.stream.*;

class Solution {
    public int solution(int[][] board) {
        return IntStream.range(0, board.length)
                .map(i -> IntStream.range(0, board[i].length)
                        .map(j -> IntStream.rangeClosed(i-1, i+1)
                                .filter(x -> x >= 0 && x < board.length)
                                .flatMap(x -> IntStream.rangeClosed(j-1, j+1)
                                        .filter(y -> y >= 0 && y < board[i].length && (board[x][y] == 1))
                                        .map(y -> 1)
                                        .limit(1))
                                .sum() > 0 ? 0 : 1)
                        .sum())
                .sum();
    }
}