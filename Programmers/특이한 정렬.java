import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist).boxed().sorted((a, b) -> Math.abs(a - n) != Math.abs(b - n) ? Math.abs(a - n) - Math.abs(b - n) : b - a).mapToInt(Integer::intValue).toArray();
    }
}