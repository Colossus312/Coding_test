class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        while (n > 0){
            answer = n % num == 0 ? answer+1 : answer;
            n -= num;
            num++;
        }
        return answer;
    }
}