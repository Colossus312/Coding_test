import java.util.stream.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        return IntStream.range(0, my_string.length() / m).mapToObj(i -> String.valueOf(my_string.charAt(i * m + c - 1))).collect(Collectors.joining());
    }
}