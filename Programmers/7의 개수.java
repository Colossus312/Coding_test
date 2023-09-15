import java.util.*;

class Solution {
    public int solution(int[] array) {
        return Arrays.stream(array).mapToObj(Integer::toString).mapToInt(s -> s.length() - s.replace("7", "").length()).sum();
    }
}