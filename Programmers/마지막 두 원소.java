import java.util.Arrays;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] num_list) {
        return num_list[num_list.length - 1] > num_list[num_list.length - 2]
                ? IntStream.concat(Arrays.stream(num_list), IntStream.of(num_list[num_list.length - 1] - num_list[num_list.length - 2])).toArray()
                : IntStream.concat(Arrays.stream(num_list), IntStream.of(num_list[num_list.length - 1] * 2)).toArray();
    }
}