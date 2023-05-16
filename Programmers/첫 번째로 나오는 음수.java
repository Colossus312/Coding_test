import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        return (int) Arrays.stream(num_list)
                .boxed()
                .takeWhile(num -> num >= 0)
                .count() == num_list.length ? -1 : (int) Arrays.stream(num_list)
                .boxed()
                .takeWhile(num -> num >= 0)
                .count();
    }
}