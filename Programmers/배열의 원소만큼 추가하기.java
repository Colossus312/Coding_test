import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        return IntStream.range(0, arr.length).flatMap(i -> IntStream.generate(() -> arr[i]).limit(arr[i])).toArray();
    }
}