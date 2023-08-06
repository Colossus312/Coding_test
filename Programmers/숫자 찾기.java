class Solution {
    public int solution(int num, int k) {
        return String.valueOf(num).contains(String.valueOf(k)) ? String.valueOf(num).indexOf(String.valueOf(k)) + 1 : -1;
    }
}