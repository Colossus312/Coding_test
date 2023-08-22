class Solution {
    public int solution(String before, String after) {
        return (before.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString().equals(after.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString())) ? 1 : 0;
    }
}