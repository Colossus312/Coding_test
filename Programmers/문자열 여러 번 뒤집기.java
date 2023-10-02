import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        return Arrays.stream(queries).reduce(my_string, (str, query) -> str.substring(0, query[0]) + new StringBuilder(str.substring(query[0], query[1] + 1)).reverse().toString() + str.substring(query[1] + 1), (a, b) -> b);
    }
}