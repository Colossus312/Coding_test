import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] picture, int k) {
        return Arrays.stream(picture)
                .flatMap(s -> IntStream.range(0, k)
                        .mapToObj(i -> s.chars()
                                .mapToObj(c -> "" + (char)c)
                                .collect(Collectors.joining(""))
                                .replace(".", ".".repeat(k))
                                .replace("x", "x".repeat(k))
                        )
                ).toArray(String[]::new);
    }
}