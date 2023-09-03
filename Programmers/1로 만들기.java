import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        return Arrays.stream(num_list).map(i -> {int count = 0; while (i != 1) {i = (i % 2 == 0) ? i / 2 : (i - 1) / 2; count++;} return count;}).sum();
    }
}