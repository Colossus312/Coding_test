import java.util.stream.IntStream;
class Solution {
    public int solution(int[] numbers, int n) {
        return IntStream.range(0, numbers.length)
                .filter(i -> IntStream.range(0, i).map(j -> numbers[j]).sum() > n)
                .map(i -> IntStream.range(0, i).map(j -> numbers[j]).sum())
                .findFirst()
                .orElse(IntStream.range(0, numbers.length).map(i -> numbers[i]).sum());
    }
}