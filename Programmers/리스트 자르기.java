import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        return n == 1 ? Arrays.copyOfRange(num_list, 0, slicer[1] + 1) : n == 2 ? Arrays.copyOfRange(num_list, slicer[0], num_list.length) : n == 3 ? Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1) : IntStream.rangeClosed(slicer[0], slicer[1]).filter(i -> (i - slicer[0]) % slicer[2] == 0).map(i -> num_list[i]).toArray();
    }
}