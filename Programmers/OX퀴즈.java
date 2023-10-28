import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        return Arrays.stream(quiz).map(q -> q.split(" ")).map(p -> (Integer.parseInt(p[0]) + (p[1].equals("+") ? Integer.parseInt(p[2]) : -Integer.parseInt(p[2]))) == Integer.parseInt(p[4]) ? "O" : "X").toArray(String[]::new);
    }
}