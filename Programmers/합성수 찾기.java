import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.range(4, n + 1).filter(x -> IntStream.range(2, (int) Math.sqrt(x) + 1).filter(y -> x % y == 0).count() >= 1).count();
    }
}
