import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        return "right".equals(direction)
                ? IntStream.range(0, numbers.length).map(i -> numbers[(i + numbers.length - 1) % numbers.length]).toArray()
                : IntStream.range(0, numbers.length).map(i -> numbers[(i + 1) % numbers.length]).toArray();
    }
}