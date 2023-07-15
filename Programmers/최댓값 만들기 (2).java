import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        return Arrays.stream(numbers)
                .flatMap(a -> Arrays.stream(numbers)
                .filter(b -> b != a || Arrays.stream(numbers).filter(x -> x == a).count() > 1)
                .map(b -> a * b))
                .max()
                .orElse(Integer.MAX_VALUE);
    }
}