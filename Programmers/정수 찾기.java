import java.util.*;
class Solution {
    public int solution(int[] num_list, int n) {
        return (int) Arrays.stream(num_list)
                .boxed()
                .collect(java.util.stream.Collectors.toList())
                .indexOf(n) >= 1 ? 1 : 0;
    }
}