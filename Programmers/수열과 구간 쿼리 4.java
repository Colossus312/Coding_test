import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        return Arrays.stream(queries).map(q -> { for(int i = q[0]; i <= q[1]; i++) if (i % q[2] == 0) arr[i]++; return arr; }).reduce((a, b) -> b).orElse(new int[0]);
    }
}