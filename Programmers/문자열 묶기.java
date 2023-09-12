import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class Solution {
    public int solution(String[] strArr) {
        return Arrays.stream(strArr).collect(Collectors.groupingBy(String::length, Collectors.counting())).values().stream().max(Long::compare).orElse(0L).intValue();
    }
}