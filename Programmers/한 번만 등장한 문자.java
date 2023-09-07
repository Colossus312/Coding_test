import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return s.chars().filter(ch -> s.indexOf(ch) == s.lastIndexOf(ch)).sorted().mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining());
    }
}