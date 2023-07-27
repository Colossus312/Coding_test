class Solution {
    public int solution(String binomial) {
        return new java.util.Scanner(binomial).useDelimiter("\\s*\\Q+\\E\\s*|\\s*\\Q-\\E\\s*|\\s*\\Q*\\E\\s*").tokens().mapToInt(Integer::parseInt).reduce((a, b) -> binomial.contains("+") ? a + b : binomial.contains("-") ? a - b : a * b).getAsInt();
    }
}