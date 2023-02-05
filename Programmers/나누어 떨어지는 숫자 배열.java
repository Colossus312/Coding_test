import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        int cnt = 0;
        for(int i : arr){
            if(i%divisor == 0){
                cnt++;
            }
        }
        if(cnt == 0){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[cnt];
        int j = 0;
        for(int i : arr){
            if(i%divisor == 0){
                answer[j] = i;
                j++;
            }
        }

        Arrays.sort(answer);

        return answer;
    }
}