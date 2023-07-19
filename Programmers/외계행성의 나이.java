import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        return String.valueOf(String.valueOf(age).chars().mapToObj(digit -> String.valueOf((char) ('a' + (digit - '0')))).collect(Collectors.joining()));
    }
}