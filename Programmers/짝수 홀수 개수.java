import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        return new int[]{(int)Arrays.stream(num_list).filter(n -> n % 2 == 0).count(), (int)Arrays.stream(num_list).filter(n -> n % 2 != 0).count()};
    }
}