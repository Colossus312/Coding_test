import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        return Arrays.stream(num_list)
                .reduce(1, (a, b) -> a * b) < Arrays.stream(num_list)
                .sum() * Arrays.stream(num_list)
                .sum() ? 1 : 0;
    }
}