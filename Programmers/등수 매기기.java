import java.util.stream.*;

class Solution {
    public int[] solution(int[][] score) {
        return IntStream.range(0, score.length).map(i -> IntStream.range(0, score.length).map(j -> (score[j][0] + score[j][1] > score[i][0] + score[i][1]) ? 1 : 0).sum() + 1).toArray();
    }
}