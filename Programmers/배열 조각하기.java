import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0, end = arr.length;
        for (int i = 0; i < query.length && query[i] < end - start; i++) {
            if (i % 2 == 0) end = start + query[i] + 1;
            else start = start + query[i];
        }
        return IntStream.range(start, end).map(i -> arr[i]).toArray();
    }
}