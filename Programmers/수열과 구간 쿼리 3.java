import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        return IntStream.range(0, queries.length).mapToObj(i -> { int temp = arr[queries[i][0]]; arr[queries[i][0]] = arr[queries[i][1]]; arr[queries[i][1]] = temp; return arr; }).reduce((a, b) -> b).orElse(arr);
    }
}