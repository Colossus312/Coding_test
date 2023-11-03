import java.util.stream.IntStream;

class Solution {
    public int[] solution(int num, int total) {
        return IntStream.rangeClosed(1, num).map(i -> total/num - (num-1)/2 + i - 1).toArray();
    }
}