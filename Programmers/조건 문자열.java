class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        return (ineq.equals(">") ? (eq.equals("=") ? n >= m : n > m) : (eq.equals("=") ? n <= m : n < m)) ? 1 : 0;
    }
}