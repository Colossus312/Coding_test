import java.util.stream.IntStream;

class Solution {
    public int[] solution(String my_string) {
        return IntStream.concat("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".chars(), my_string.chars())
                .limit(52)
                .map(ch -> (int) my_string.chars().filter(c -> c == ch).count())
                .toArray();
    }
}