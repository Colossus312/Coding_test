import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        return Arrays.stream(arr).filter(num -> !IntStream.of(delete_list).anyMatch(deleteNum -> deleteNum == num)).toArray();
    }
}