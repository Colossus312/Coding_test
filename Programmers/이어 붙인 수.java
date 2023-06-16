import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        return Arrays.stream(num_list)
                .filter(num -> num % 2 == 1)
                .reduce(0, (sum, num) -> sum * 10 + num) +
                Arrays.stream(num_list)
                        .filter(num -> num % 2 == 0)
                        .reduce(0, (sum, num) -> sum * 10 + num);
    }
}