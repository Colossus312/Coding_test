
import java.util.stream.IntStream;
import java.util.Arrays;


class Solution {
    public int[] solution(int[] arr) {
        return IntStream.concat(Arrays.stream(arr), IntStream.generate(() -> 0).limit(Math.max(0, (1 << (int)Math.ceil(Math.log(arr.length) / Math.log(2))) - arr.length))).toArray();
    }
}