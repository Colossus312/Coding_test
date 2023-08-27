import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        return Arrays.stream(array).boxed().min((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? a - b : Math.abs(a - n) - Math.abs(b - n)).get();
    }
}