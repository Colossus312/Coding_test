import java.util.Stack;

class Solution {
    public int solution(String s) {
        return new Stack<Integer>() {{ for (String x : s.split(" ")) if ("Z".equals(x)) pop(); else push(Integer.parseInt(x)); }}.stream().mapToInt(Integer::intValue).sum();
    }
}