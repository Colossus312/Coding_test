class Solution {
    public int solution(int order) {
        return (int) Integer.toString(order).chars().filter(c -> c == '3' || c == '6' || c == '9').count();
    }
}
