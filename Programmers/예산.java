import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int a : d){
            budget-= a;
            answer++;
            if(budget == 0){
                return answer;
            }else if(budget < 0){
                return answer-1;
            }
        }
        return answer;
    }
}