import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        Arrays.stream(queries).forEach(query -> Arrays.setAll(arr, i -> (i >= query[0] && i <= query[1]) ? arr[i] + 1 : arr[i]));
        return arr;
    }
}