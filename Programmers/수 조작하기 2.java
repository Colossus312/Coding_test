import java.util.stream.*;

class Solution {
    public String solution(int[] numLog) {
        return IntStream.range(1, numLog.length).mapToObj(i -> numLog[i] - numLog[i - 1] == 1 ? "w" : numLog[i] - numLog[i - 1] == -1 ? "s" : numLog[i] - numLog[i - 1] == 10 ? "d" : numLog[i] - numLog[i - 1] == -10 ? "a" : "").collect(Collectors.joining());
    }
}