import java.util.Arrays;

class Solution {
    public String solution(String polynomial) {
        return (polynomial.contains("x") ? (Arrays.stream(polynomial.split("\\+")).filter(s -> s.contains("x")).mapToInt(s -> s.trim().equals("x") ? 1 : Integer.parseInt(s.trim().replace("x", ""))).sum() == 1 ? "x" : Arrays.stream(polynomial.split("\\+")).filter(s -> s.contains("x")).mapToInt(s -> s.trim().equals("x") ? 1 : Integer.parseInt(s.trim().replace("x", ""))).sum() + "x") : "") + (Arrays.stream(polynomial.split("\\+")).filter(s -> !s.contains("x")).mapToInt(s -> Integer.parseInt(s.trim())).sum() > 0 ? (polynomial.contains("x") ? " + " : "") + Arrays.stream(polynomial.split("\\+")).filter(s -> !s.contains("x")).mapToInt(s -> Integer.parseInt(s.trim())).sum() : "");

    }
}