class Solution {
    public int solution(int a, int b) {
        return Integer.parseInt((Integer.toString(a) + Integer.toString(b))) > Integer.parseInt((Integer.toString(b) + Integer.toString(a))) ? Integer.parseInt((Integer.toString(a) + Integer.toString(b))) : Integer.parseInt((Integer.toString(b) + Integer.toString(a)));
    }
}