import java.util.*;
import java.util.stream.Stream;
class Solution {
    public String solution(String s) {
        int[] arr = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        return Integer.toString(arr[0]) + " " + Integer.toString(arr[arr.length-1]);

    }
}