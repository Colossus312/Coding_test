import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public String solution(String my_string, int[] indices) {
        return IntStream.range(0, my_string.length())
                .filter(i -> Arrays.stream(indices).noneMatch(x -> x == i))
                .mapToObj(my_string::charAt)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}