class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        int answer = 0;

        while(n > 1){
            if(n % 2 == 0){
                matches = n / 2;
                n = n / 2;
                answer += matches;
            }
            else{
                matches = ((n-1) / 2);
                n = matches + 1;
                answer += matches;
            }
        }
        return answer;
    }
}