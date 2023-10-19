import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.iterate(1, i -> i + 1).filter(i -> i % 3 != 0 && !String.valueOf(i).contains("3")).limit(n).reduce((a, b) -> b).getAsInt();
    }
}