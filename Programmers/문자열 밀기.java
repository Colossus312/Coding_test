import java.util.stream.IntStream;

class Solution {
    public int solution(String A, String B) {
        return IntStream.range(0, A.length()).filter(i -> (A.substring(A.length() - i) + A.substring(0, A.length() - i)).equals(B)).findFirst().orElse(-1);
    }
}