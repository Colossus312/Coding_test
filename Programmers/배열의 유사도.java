import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        return Arrays.stream(s1).filter(Arrays.asList(s2)::contains).toArray().length;
    }
}