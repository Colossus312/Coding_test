import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] array) {
        return Arrays.stream(array).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()) == 0 ? e1.getKey().compareTo(e2.getKey()) : e2.getValue().compareTo(e1.getValue())).reduce((e1, e2) -> e1.getValue().equals(e2.getValue()) ? new AbstractMap.SimpleEntry<>(-1, e1.getValue()) : e1).get().getKey();
    }
}