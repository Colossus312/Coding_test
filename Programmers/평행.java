import java.util.stream.IntStream;

class Solution {
    public int solution(int[][] dots) {
        return IntStream.range(0, 3).anyMatch(i ->
                IntStream.range(i + 1, 4).anyMatch(j ->
                        IntStream.range(0, 3).anyMatch(k ->
                                IntStream.range(k + 1, 4).anyMatch(l ->
                                        i != k && i != l && j != k && j != l &&
                                                (dots[j][1] - dots[i][1]) * (dots[l][0] - dots[k][0]) == (dots[l][1] - dots[k][1]) * (dots[j][0] - dots[i][0])
                                )
                        )
                )
        ) ? 1 : 0;
    }
}