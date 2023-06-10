import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        return Arrays.stream(strArr)
                .map(s -> Arrays.asList(strArr).indexOf(s) % 2 == 0 ? s.toLowerCase() : s.toUpperCase())
                .toArray(String[]::new);
    }
}