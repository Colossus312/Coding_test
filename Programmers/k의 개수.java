import java.util.stream.IntStream;

class Solution {
    public int solution(int i, int j, int k) {
        return IntStream.rangeClosed(i, j).mapToObj(Integer::toString).mapToInt(s -> (int) s.chars().filter(c -> c == (k + '0')).count()).sum();
    }
}