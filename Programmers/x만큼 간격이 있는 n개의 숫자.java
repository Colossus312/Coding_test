class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 1 ; n >= i; i++){
            answer[i-1] = x*((long)i);
        }
        return answer;
    }
}