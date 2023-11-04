import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[][] lines) {
        return IntStream.rangeClosed(-100, 100).map(
                x -> (int) Arrays.stream(lines).filter(line -> line[0] <= x && line[1] > x).count() > 1 ? 1 : 0
        ).sum();
    }
}