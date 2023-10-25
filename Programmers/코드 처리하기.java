import java.util.stream.IntStream;

class Solution {
    public String solution(String code) {
        return IntStream.range(0, code.length()).boxed().reduce(new StringBuilder(), (sb, i) -> code.charAt(i) == '1' ? sb.append('1') : (sb.toString().chars().filter(c -> c == '1').count() % 2 == i % 2) ? sb.append(code.charAt(i)) : sb, StringBuilder::append).toString().replace("1", "").isEmpty() ? "EMPTY" : IntStream.range(0, code.length()).boxed().reduce(new StringBuilder(), (sb, i) -> code.charAt(i) == '1' ? sb.append('1') : (sb.toString().chars().filter(c -> c == '1').count() % 2 == i % 2) ? sb.append(code.charAt(i)) : sb, StringBuilder::append).toString().replace("1", "");
    }
}