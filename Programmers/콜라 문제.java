class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int sum = n/a;
            int od = n%a;
            int nw = sum*b;
            answer+=nw;
            n = od + nw;
        }
        return answer;
    }
}