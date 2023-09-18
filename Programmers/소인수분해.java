import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(2, n).filter(i -> n % i == 0 && IntStream.range(2, (int)Math.sqrt(i) + 1).allMatch(j -> i % j != 0)).toArray();
    }
}