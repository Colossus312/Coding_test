import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int l, int r) {
        return IntStream.rangeClosed(l, r).filter(i -> String.valueOf(i).matches("[05]+")).toArray().length == 0 ? new int[]{-1} : IntStream.rangeClosed(l, r).filter(i -> String.valueOf(i).matches("[05]+")).toArray();
    }
}