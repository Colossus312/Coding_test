import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] names) {
        return IntStream.range(0, (names.length + 4) / 5)
                .mapToObj(i -> names[i * 5])
                .toArray(String[]::new);
    }
}