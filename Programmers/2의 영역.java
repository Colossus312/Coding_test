import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        return !IntStream.of(arr).anyMatch(x -> x == 2) ? new int[] {-1} : Arrays.copyOfRange(arr, IntStream.range(0, arr.length).filter(i -> arr[i] == 2).findFirst().orElse(-1), IntStream.range(0, arr.length).filter(i -> arr[i] == 2).reduce((a, b) -> b).orElse(-1) + 1);
    }
}