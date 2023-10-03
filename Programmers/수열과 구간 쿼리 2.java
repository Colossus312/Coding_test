import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        return Arrays.stream(queries)
                .mapToInt(q -> IntStream.rangeClosed(q[0], q[1])
                        .map(i -> arr[i])
                        .filter(v -> v > q[2])
                        .min()
                        .orElse(-1))
                .toArray();
    }
}