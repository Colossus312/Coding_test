class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        int i = 1;
        int oneSize = Integer.bitCount(n);
        while(num != oneSize){
            num = Integer.bitCount(n+i);
            answer = n+i;
            i++;
        }
        return answer;
    }
}