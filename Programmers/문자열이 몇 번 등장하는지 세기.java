import java.util.stream.IntStream;

class Solution {
    public int solution(String myString, String pat) {
        return IntStream.range(0, myString.length() - pat.length() + 1).map(i -> myString.startsWith(pat, i) ? 1 : 0).sum();
    }
}