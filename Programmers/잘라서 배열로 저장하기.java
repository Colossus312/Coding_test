import java.util.stream.IntStream;

class Solution {
    public String[] solution(String my_str, int n) {
        return IntStream.range(0, (my_str.length() + n - 1) / n)
                .mapToObj(i -> my_str.substring(i * n, Math.min((i + 1) * n, my_str.length())))
                .toArray(String[]::new);
    }
}