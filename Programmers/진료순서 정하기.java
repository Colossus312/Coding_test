import java.util.stream.*;

class Solution {
    public int[] solution(int[] emergency) {
        return IntStream.range(0, emergency.length).map(i -> IntStream.range(0, emergency.length).boxed().sorted((a, b) -> Integer.compare(emergency[b], emergency[a])).collect(Collectors.toList()).indexOf(i) + 1).toArray();
    }
}