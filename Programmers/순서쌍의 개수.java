import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, (int) Math.sqrt(n))
                .filter(i -> n % i == 0)
                .flatMap(i -> n / i == i ? IntStream.of(1) : IntStream.of(2))
                .sum();
    }
}