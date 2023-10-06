import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int[][] solution(int[][] arr) {
        return arr.length > arr[0].length ? Arrays.stream(arr).map(row -> Arrays.copyOf(row, arr.length)).toArray(int[][]::new) : arr.length < arr[0].length ? Stream.concat(Arrays.stream(arr), Stream.generate(() -> new int[arr[0].length]).limit(arr[0].length - arr.length)).toArray(int[][]::new) : arr;
    }
}