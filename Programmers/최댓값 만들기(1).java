import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .sorted((a, b) -> b - a)
                .limit(2)
                .reduce((x, y) -> x * y)
                .orElse(0);
    }
}