import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] array) {
        return new int[]{array[IntStream.range(0, array.length).reduce((a, b) -> array[a] > array[b] ? a : b).getAsInt()], IntStream.range(0, array.length).reduce((a, b) -> array[a] > array[b] ? a : b).getAsInt()};
    }
}