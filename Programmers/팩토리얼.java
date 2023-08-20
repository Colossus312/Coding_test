import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(1, 11).filter(i -> IntStream.rangeClosed(1, i).reduce(1, (a, b) -> a * b) <= n).max().orElse(0);
    }
}