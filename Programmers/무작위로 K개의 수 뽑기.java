import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        return IntStream.concat(Arrays.stream(arr).distinct().limit(k), IntStream.generate(() -> -1)).limit(k).toArray();
    }
}