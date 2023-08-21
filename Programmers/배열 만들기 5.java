import java.util.Arrays;
import java.util.stream.*;


class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
                .mapToInt(str -> Integer.parseInt(str.substring(s, s+l)))
                .filter(val -> val > k)
                .toArray();
    }
}