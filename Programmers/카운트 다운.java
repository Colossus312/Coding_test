import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int start, int end) {
        return IntStream.range(0, start - end + 1)
                .map(i -> start - i)
                .toArray();
    }
}